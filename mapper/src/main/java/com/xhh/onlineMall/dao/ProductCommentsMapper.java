package com.xhh.onlineMall.dao;

import com.xhh.onlineMall.entity.ProductComments;
import com.xhh.onlineMall.entity.ProductCommentsExample;
import com.xhh.onlineMall.entity.ProductCommentsVO;
import com.xhh.onlineMall.general.GeneralDao;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCommentsMapper extends GeneralDao<ProductComments> {

    List<ProductCommentsVO> selectCommentsByProductId(String productId);
}