package com.xhh.onlineMall.dao;

import com.xhh.onlineMall.entity.ProductParams;
import com.xhh.onlineMall.entity.ProductParamsExample;
import com.xhh.onlineMall.general.GeneralDao;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductParamsMapper extends GeneralDao<ProductParams> {
    int countByExample(ProductParamsExample example);

    int deleteByExample(ProductParamsExample example);

    List<ProductParams> selectByExample(ProductParamsExample example);

    int updateByExampleSelective(@Param("record") ProductParams record, @Param("example") ProductParamsExample example);

    int updateByExample(@Param("record") ProductParams record, @Param("example") ProductParamsExample example);
}