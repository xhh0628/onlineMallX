package com.xhh.onlineMall.dao;

import com.xhh.onlineMall.entity.ShoppingCart;
import com.xhh.onlineMall.entity.ShoppingCartExample;
import com.xhh.onlineMall.general.GeneralDao;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartMapper extends GeneralDao<ShoppingCart> {
    int countByExample(ShoppingCartExample example);

    int deleteByExample(ShoppingCartExample example);

    List<ShoppingCart> selectByExample(ShoppingCartExample example);

    int updateByExampleSelective(@Param("record") ShoppingCart record, @Param("example") ShoppingCartExample example);

    int updateByExample(@Param("record") ShoppingCart record, @Param("example") ShoppingCartExample example);
}