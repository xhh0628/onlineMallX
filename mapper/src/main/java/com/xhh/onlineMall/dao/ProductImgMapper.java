package com.xhh.onlineMall.dao;

import com.xhh.onlineMall.entity.ProductImg;
import com.xhh.onlineMall.entity.ProductImgExample;
import com.xhh.onlineMall.general.GeneralDao;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductImgMapper extends GeneralDao<ProductImg> {
    int countByExample(ProductImgExample example);

    int deleteByExample(ProductImgExample example);

    List<ProductImg> selectByExample(ProductImgExample example);

    int updateByExampleSelective(@Param("record") ProductImg record, @Param("example") ProductImgExample example);

    int updateByExample(@Param("record") ProductImg record, @Param("example") ProductImgExample example);

    //根据商品id查询对应图片信息
    List<ProductImg> selectProductImgsByProductId(int productId);
}