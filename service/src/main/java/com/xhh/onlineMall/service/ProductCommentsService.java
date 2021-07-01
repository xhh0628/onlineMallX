package com.xhh.onlineMall.service;

import com.xhh.onlineMall.vo.ResultVO;

public interface ProductCommentsService {

    //商品id，每页条数
    ResultVO listCommentsByProductId(String productId,int pageNum,int limit);

    /**
     * 根据商品id查询当前商品的总评价数
     * @param productId
     * @return
     */
    ResultVO gerCommentsCountByProductId(String productId);
}
