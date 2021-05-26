package com.xhh.onlineMall.dao;

import com.xhh.onlineMall.entity.ProductComments;
import com.xhh.onlineMall.entity.ProductCommentsExample;
import com.xhh.onlineMall.general.GeneralDao;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCommentsMapper extends GeneralDao<ProductComments> {
    int countByExample(ProductCommentsExample example);

    int deleteByExample(ProductCommentsExample example);

    List<ProductComments> selectByExample(ProductCommentsExample example);

    int updateByExampleSelective(@Param("record") ProductComments record, @Param("example") ProductCommentsExample example);

    int updateByExample(@Param("record") ProductComments record, @Param("example") ProductCommentsExample example);
}