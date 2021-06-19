package com.xhh.onlineMall.service;

import com.xhh.onlineMall.vo.ResultVO;

import java.util.List;

public interface CategoryService {

    /**
     * 连接查询实现
     * @return
     */
    ResultVO selectListCategories();

    /**
     * 子查询实现
     * @return
     */
    ResultVO selectListCategories2(int parentId);
}
