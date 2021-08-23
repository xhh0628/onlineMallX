package com.xhh.onlineMall.controller;

import com.xhh.onlineMall.service.OrderService;
import com.xhh.onlineMall.service.impl.OrderServiceImpl;
import com.xhh.onlineMall.websocket.WebSocketServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 支付回调
 */
@RestController
@CrossOrigin
@RequestMapping("/pay")
public class PayController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/callback")
    public void paySuccess(@RequestParam("orderId")String orderId){

        //1向接受微信平台传递的返回数据
        //判断是否支付成功

        //支付成功后

            //修改数据库状态
            String status="2";
            int i= orderService.updateOrderStatus(orderId,status);//订单编号，状态
            //通过websocket连接，向前端推送消息
            WebSocketServer.sendMsg(orderId,"1");
            //修改数据库状态成功
            if (i>0){
                //修改数据库成功_再次响应微信支付平台
            }

    }
}
