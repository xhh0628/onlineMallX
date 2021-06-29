package com.xhh.onlineMall.service.impl;

import com.xhh.onlineMall.dao.ProductCommentsMapper;
import com.xhh.onlineMall.entity.ProductCommentsVO;
import com.xhh.onlineMall.service.ProductCommentsService;
import com.xhh.onlineMall.vo.ResStatus;
import com.xhh.onlineMall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCommentsServiceImpl implements ProductCommentsService {

    @Autowired
    private ProductCommentsMapper productCommentsMapper;

    @Override
    public ResultVO listCommentsByProductId(String productId) {
        List<ProductCommentsVO> productCommentsVOS = productCommentsMapper.selectCommentsByProductId(productId);
        return new ResultVO(ResStatus.OK,"success",productCommentsVOS);
    }
}
