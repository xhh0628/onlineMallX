package com.xhh.onlineMall.service;

import com.xhh.onlineMall.vo.ResultVO;


public interface ProductService {

    ResultVO selectRecommendProductsList();

    ResultVO getProductBasicInfo(String productId);
}
