package com.xhh.onlineMall.dao;

import com.xhh.onlineMall.entity.Orders;
import com.xhh.onlineMall.entity.OrdersExample;
import com.xhh.onlineMall.general.GeneralDao;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersMapper extends GeneralDao<Orders> {
    int countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    List<Orders> selectByExample(OrdersExample example);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);
}