package com.xhh.onlineMall.dao;

import com.xhh.onlineMall.entity.Product;
import com.xhh.onlineMall.entity.ProductExample;
import com.xhh.onlineMall.general.GeneralDao;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMapper extends GeneralDao<Product> {
    int countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    List<Product> selectByExampleWithBLOBs(ProductExample example);

    List<Product> selectByExample(ProductExample example);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExampleWithBLOBs(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);
}