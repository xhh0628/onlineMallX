package com.xhh.onlineMall.service.impl;

import com.xhh.onlineMall.dao.ProductMapper;
import com.xhh.onlineMall.entity.ProductVO;
import com.xhh.onlineMall.service.ProductService;
import com.xhh.onlineMall.vo.ResStatus;
import com.xhh.onlineMall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public ResultVO selectRecommendProductsList() {
        List<ProductVO> productVOS = productMapper.selectRecommendProducts();
        ResultVO vo = new ResultVO(ResStatus.OK, "sucess", productVOS);
        return vo;
    }
}
