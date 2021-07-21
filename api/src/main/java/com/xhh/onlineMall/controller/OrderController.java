package com.xhh.onlineMall.controller;

import com.github.wxpay.sdk.WXPay;
import com.xhh.onlineMall.config.MyPayConfig;
import com.xhh.onlineMall.entity.Orders;
import com.xhh.onlineMall.service.OrderService;
import com.xhh.onlineMall.vo.ResStatus;
import com.xhh.onlineMall.vo.ResultVO;
import io.swagger.annotations.Api;
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
    public ResultVO add(String cids, @RequestBody Orders order){
        ResultVO vo = null;
        try {
            vo = OrderService.addOrder(cids, order);
            //申请支付短链接——使用微信
            //https://api.mch.weixin.qq.com/v3/pay/transactions/native
            //设置商户信息
            WXPay wxPay = new WXPay(new MyPayConfig());
            //设置当前订单信息
            HashMap<String, String> data = new HashMap<>();
            data.put("body","虾条");//商品描述
            data.put("out_trade_no",vo.getData().toString());//交易编号,用户当前订单的编号，作为支付交易的交易号
            data.put("fee_type","CNY");//支付币种
            data.put("total_type","1");//支付金额_分为单位
            data.put("trade_type","NATIVE");//交易类型
            data.put("notify_url","/pay/success");//设置支付完成时的回调方法接口
            //发送请求获取相应
            Map<String, String> resp = wxPay.unifiedOrder(data);//异常向下抛出
            System.out.println("微信支付结果"+resp);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            new ResultVO(ResStatus.NO,"提交订单失败",null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vo;
    }


}
