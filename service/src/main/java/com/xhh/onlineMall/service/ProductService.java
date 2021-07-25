package com.xhh.onlineMall.service;

import com.xhh.onlineMall.vo.ResultVO;


public interface ProductService {

    ResultVO selectRecommendProductsList();

    ResultVO getProductBasicInfo(String productId);

    ResultVO getProductParamsById(String productId);

    ResultVO getProductsByCategoryId(int categoryId,int pageNum,int limit);
}
