package com.xhh.onlineMall.dao;

import com.xhh.onlineMall.entity.OrderItem;
import com.xhh.onlineMall.entity.OrderItemExample;
import com.xhh.onlineMall.general.GeneralDao;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemMapper extends GeneralDao<OrderItem> {
    int countByExample(OrderItemExample example);

    int deleteByExample(OrderItemExample example);

    List<OrderItem> selectByExample(OrderItemExample example);

    int updateByExampleSelective(@Param("record") OrderItem record, @Param("example") OrderItemExample example);

    int updateByExample(@Param("record") OrderItem record, @Param("example") OrderItemExample example);
}