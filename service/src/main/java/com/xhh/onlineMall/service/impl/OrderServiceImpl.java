package com.xhh.onlineMall.service.impl;

import com.xhh.onlineMall.dao.OrderItemMapper;
import com.xhh.onlineMall.dao.OrdersMapper;
import com.xhh.onlineMall.dao.ProductSkuMapper;
import com.xhh.onlineMall.dao.ShoppingCartMapper;
import com.xhh.onlineMall.entity.OrderItem;
import com.xhh.onlineMall.entity.Orders;
import com.xhh.onlineMall.entity.ProductSku;
import com.xhh.onlineMall.entity.ShoppingCartVO;
import com.xhh.onlineMall.service.OrderService;
import com.xhh.onlineMall.vo.ResStatus;
import com.xhh.onlineMall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.math.BigDecimal;
import java.util.*;

@Service
public class OrderServiceImpl /*implements OrderService*/ {

    @Autowired
    private ShoppingCartMapper shoppingCartMapper;
    @Autowired
    private OrdersMapper ordersMapper;
    @Autowired
    private OrderItemMapper orderItemMapper;
    @Autowired
    private ProductSkuMapper productSkuMapper;

    /**
     *
     * @param order 订单对象
     * @param cids 购物车的id
     * @return
     */
    /*@Override*/
    public ResultVO addOrder(String cids,Orders order) {
        //根据cids查询当前订单中关联的购物车记录详情
        String[] arr=cids.split(",");
        List<Integer> cidsList= new ArrayList<>();
        for (int i = 0; i < arr.length  ; i++) {
            cidsList.add(Integer.parseInt(arr[i]));
        }
        List<ShoppingCartVO> shoppingCartVOSList = shoppingCartMapper.selectShopCartByCids(cidsList); //提交时选择的购物车条数对应的商品信息

        //校验库存是否合规
        boolean f=true;
        String untitled="";
        for(ShoppingCartVO sc :shoppingCartVOSList){
            if (Integer.parseInt(sc.getCartNum())> sc.getSkuStock()){
                //购买数量大于库存数量
                f=false;
            }
            //获取所有商品名称，以，分割，拼接成字符串
            untitled=untitled+sc.getProductName()+",";
        }

        if (f){
            //表示库存充足__保存订单
            //userid
            //untitled
            //收货人信息：receiverName姓名，receiverMobile联系方式，address地址
            //总价格=实际支付价格price
            //支付方式payType
            //订单备注orderRemark
            //创建时间
            //订单初始状态（待支付1
            order.setUntitled(untitled);
            order.setCreateTime(new Date());
            order.setStatus("1");
            //生成订单编号
            String orderId=UUID.randomUUID().toString().replace("-","");
            order.setOrderId(orderId);
            //保存订单
            int i=ordersMapper.insert(order);

                //订单保存成功__生产订单快照
                List<OrderItem> orderItems=new ArrayList<>();
                for(ShoppingCartVO sc:shoppingCartVOSList){
                    String itemId=System.currentTimeMillis()+""+(new Random().nextInt(89999)+10000);
                    OrderItem orderItem = new OrderItem(itemId, orderId, sc.getProductId(),
                            sc.getProductName(), sc.getProductImg(),
                            sc.getSkuId(), sc.getSkuName(),  new BigDecimal(sc.getSellPrice()),
                            Integer.parseInt(sc.getCartNum()), new BigDecimal(sc.getSellPrice() * Integer.parseInt(sc.getCartNum())),
                            new Date(), new Date(), 0);
                    orderItems.add(orderItem);
                }
                int j = orderItemMapper.insertList(orderItems);

                //扣减库存
                for(ShoppingCartVO sc:shoppingCartVOSList){
                    String skuId = sc.getSkuId();
                    int newStock=sc.getSkuStock()- Integer.parseInt(sc.getCartNum());//新库存量=老库存量-购买数量

                    ProductSku productSku = new ProductSku();
                    productSku.setSkuId(skuId);
                    productSku.setStock(newStock);
                    productSkuMapper.updateByPrimaryKeySelective(productSku);//根据主键修改库存数量
                }
            return new ResultVO(ResStatus.OK,"下单成功",orderId);
        }else{
            //表示库存不足
            return new ResultVO(ResStatus.NO,"库存不足，下单失败",null);
        }

    }


}
