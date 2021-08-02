package com.xhh.onlineMall.controller;

import com.github.wxpay.sdk.WXPay;
import com.xhh.onlineMall.config.MyPayConfig;
import com.xhh.onlineMall.entity.Orders;
import com.xhh.onlineMall.service.OrderService;
import com.xhh.onlineMall.vo.ResStatus;
import com.xhh.onlineMall.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/order")
@Api(value = "订单相关接口",tags = "管理订单")
public class OrderController {

    @Autowired
    private OrderService OrderService;

    @PostMapping("/add")
    @ApiOperation("添加订单")
    public ResultVO add(String cids, @RequestBody Orders order){
        ResultVO vo = null;
        try {
            Map<String,String> orderInfo = OrderService.addOrder(cids, order);
            String orderId=orderInfo.get("orderId");
            String productNames=orderInfo.get("productNames");
            if(orderId!=null){
                //订单保存成功
                //申请支付短链接——使用微信
                //访问https://api.mch.weixin.qq.com/v3/pay/transactions/native 注册

                //设置当前订单信息
                /*HashMap<String, String> data = new HashMap<>();
                data.put("body",productNames);//商品描述
                data.put("out_trade_no",orderId);//交易编号,用户当前订单的编号，作为支付交易的交易号
                data.put("fee_type","CNY");//支付币种
                data.put("total_fee",order.getActualAmount()*100+"");//支付金额_分为单位
                data.put("trade_type","NATIVE");//交易类型
                data.put("notify_url","/pay/success");//设置支付完成时的回调方法接口
                //设置商户信息
                WXPay wxPay = new WXPay(new MyPayConfig());
                //发送请求获取相应
                Map<String, String> resp = wxPay.unifiedOrder(data);//异常向下抛出

                orderInfo.put("payUrl",resp.get("code_url"));//获取支付短链接*/
                orderInfo.put("payUrl","lianjie.com");
                return new ResultVO(ResStatus.OK,"提交订单成功",orderInfo);
            }else{
                return new ResultVO(ResStatus.NO,"提交订单失败",null);
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return new ResultVO(ResStatus.NO,"提交订单失败",null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vo;
    }

    /**
     * 根据条件查询订单
     * @param token
     * @param userId
     * @param status
     * @param pageNum
     * @param limit
     * @return
     */
    @GetMapping("/list")
    @ApiOperation("根据条件查询订单")
    public ResultVO list(@RequestHeader("token")String token,
                         String userId,
                         String status,
                         int pageNum,
                         int limit){
        ResultVO vo = OrderService.listOrders(userId,status,pageNum,limit);
        return vo;
    }

}
