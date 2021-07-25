package com.xhh.onlineMall.service;

import com.xhh.onlineMall.entity.Orders;

import java.sql.SQLException;
import java.util.Map;

public interface OrderService {

    //添加订单
    Map<String, String> addOrder(String cids, Orders order) throws SQLException;

    int updateOrderStatus(String orderId, String status);

    void closeOrder(String orderId);
}
