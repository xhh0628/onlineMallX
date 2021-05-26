package com.xhh.onlineMall.dao;

import com.xhh.onlineMall.entity.ProductSku;
import com.xhh.onlineMall.entity.ProductSkuExample;
import com.xhh.onlineMall.general.GeneralDao;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductSkuMapper extends GeneralDao<ProductSku> {
    int countByExample(ProductSkuExample example);

    int deleteByExample(ProductSkuExample example);

    List<ProductSku> selectByExample(ProductSkuExample example);

    int updateByExampleSelective(@Param("record") ProductSku record, @Param("example") ProductSkuExample example);

    int updateByExample(@Param("record") ProductSku record, @Param("example") ProductSkuExample example);
}