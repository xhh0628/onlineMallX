package com.xhh.onlineMall.service.timeJob;

import com.xhh.onlineMall.dao.OrderItemMapper;
import com.xhh.onlineMall.dao.OrdersMapper;
import com.xhh.onlineMall.dao.ProductSkuMapper;
import com.xhh.onlineMall.entity.OrderItem;
import com.xhh.onlineMall.entity.Orders;
import com.xhh.onlineMall.entity.ProductSku;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

@Component
public class OrderTimeoutCheck {

    @Autowired
    private OrdersMapper ordersMapper;
    @Autowired
    private OrderItemMapper orderItemMapper;
    @Autowired
    private ProductSkuMapper productSkuMapper;

    @Scheduled(cron = "0/5 * * * * ?")
    public void checkAndCloseOrder(){
        //查询超过30分钟未支付的订单（status=1
        Date time = new Date(System.currentTimeMillis()- 30*60*1000);//获取当前时间向前推30分的时间
        Example example = new Example(Orders.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("status","1");
        criteria.andLessThan("createTime",time);
        List<Orders> orders = ordersMapper.selectByExample(example);//获取的是所有可能超时的订单，包含由于网络原因未成功修改状态的订单

        for (int i=0;i<orders.size();i++){
            Orders order=orders.get(i);
            Orders updateOrder=new Orders();
            // 根据订单编号向第三方（微信）支付平台查询支付状态
            boolean payStatus=false;//模拟第三方支付平台确实为未支付的状态
            if (payStatus){
                //a.第三方确认支付成功则修改订单状态status=2
                updateOrder.setOrderId(order.getOrderId());
                updateOrder.setStatus("2");
                ordersMapper.updateByPrimaryKeySelective(updateOrder);
            }else{
                //b.第三方确认未支付则向第三方支付平台关闭订单___后设置订单超时status=6,close_type=1
                updateOrder.setOrderId(order.getOrderId());
                updateOrder.setStatus("6");
                updateOrder.setCloseType(1);
                ordersMapper.updateByPrimaryKeySelective(updateOrder);
                //还原库存
                Example orderItemExample = new Example(OrderItem.class);
                Example.Criteria orderItemCriteria = orderItemExample.createCriteria();
                orderItemCriteria.andEqualTo("orderId",order.getOrderId());
                List<OrderItem> orderItems = orderItemMapper.selectByExample(orderItemExample);//根据商品id，获取商品快照
                for (int j = 0; j < orderItems.size(); j++) {
                    OrderItem orderItem = orderItems.get(j);
                    //还原库存
                    ProductSku productSku =productSkuMapper.selectByPrimaryKey(orderItem.getSkuId());//查询快照中的套餐，获取现在库存数
                    productSku.setStock(productSku.getStock()+orderItem.getBuyCounts());//现库存+订单快照的购买库存
                    productSku.setSkuId(orderItem.getSkuId());
                    productSkuMapper.updateByPrimaryKey(productSku);
                }
            }

        }



    }
}
