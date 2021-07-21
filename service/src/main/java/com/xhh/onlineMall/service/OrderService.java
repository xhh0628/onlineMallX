package com.xhh.onlineMall.service;

import com.xhh.onlineMall.entity.Orders;
import com.xhh.onlineMall.vo.ResultVO;

import java.sql.SQLException;

public interface OrderService {

    //添加订单
    ResultVO addOrder(String cids, Orders order) throws SQLException;
}
