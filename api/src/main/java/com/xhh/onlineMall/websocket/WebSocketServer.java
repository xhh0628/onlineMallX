package com.xhh.onlineMall.websocket;

import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

@Component
@ServerEndpoint("/webSocket/{oid}")//接受请求路径
public class WebSocketServer {

    //建立静态容器存放连接
    private static ConcurrentHashMap<String,Session> sessionMap=new ConcurrentHashMap<>();

    //前端（进入页面时）发送请求建立websocket，就会执行@onopen方法
    /**
     *
     * @param orderId 订单id
     * @param session  wensocket的连接
     */
    @OnOpen
    public void open(@PathParam("oid") String orderId, Session session){
        System.out.println("进入支付页面，开启websoket监听_____订单编号为："+orderId );
        sessionMap.put(orderId,session);
    }


    //前端页面关闭，或关闭websocket连接，时销毁连接
    @OnClose
    public void close(@PathParam("oid") String orderId, Session session){
        System.out.println("结束支付页面，销毁websoket监听_____订单编号为："+orderId );
        sessionMap.remove(orderId,session);
    }

    public static void sendMsg(String orderId,String msg){
        try {
            Session session=sessionMap.get(orderId);
            session.getBasicRemote().sendText(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
