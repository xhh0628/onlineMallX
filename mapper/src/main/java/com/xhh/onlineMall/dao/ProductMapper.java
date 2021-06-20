package com.xhh.onlineMall.dao;

import com.xhh.onlineMall.entity.Product;
import com.xhh.onlineMall.entity.ProductExample;
import com.xhh.onlineMall.entity.ProductVO;
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

    //查询推荐商品_最新上架的3个
    List<ProductVO> selectRecommendProducts();

    //查询1级类别下销量最高的6个
    List<ProductVO> selectTop6ByCategory(int categoryId);
}