package com.xhh.onlineMall.service;

import com.xhh.onlineMall.vo.ResultVO;

public interface ProductCommentsService {

    ResultVO listCommentsByProductId(String productId);
}
