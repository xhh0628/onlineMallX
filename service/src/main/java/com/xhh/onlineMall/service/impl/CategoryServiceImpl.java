package com.xhh.onlineMall.service.impl;

import com.xhh.onlineMall.dao.CategoryMapper;
import com.xhh.onlineMall.entity.CategoryVO;
import com.xhh.onlineMall.service.CategoryService;
import com.xhh.onlineMall.vo.ResStatus;
import com.xhh.onlineMall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
        private CategoryMapper categoryMapper;

    @Override
    public ResultVO selectListCategories() {
        List<CategoryVO> categoryVOS = categoryMapper.selectAllCategories();
        ResultVO vo = new ResultVO(ResStatus.OK, "success", categoryVOS);
        return vo;
    }

    @Override
    public ResultVO selectListCategories2(int parentId) {
        List<CategoryVO> categoryVOS = categoryMapper.selectAllCategories2(parentId);
        ResultVO vo = new ResultVO(ResStatus.OK, "success", categoryVOS);
        return vo;
    }

    @Override
    public ResultVO selectListFirstLevelCategories() {
        List<CategoryVO> categoryVOS = categoryMapper.selectFirstLevelCategories();
        ResultVO vo = new ResultVO(ResStatus.OK, "success", categoryVOS);
        return vo;
    }

}
