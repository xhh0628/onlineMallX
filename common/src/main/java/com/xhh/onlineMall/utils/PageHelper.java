package com.xhh.onlineMall.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 分页实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageHelper<T> {

    //总条数
    private int count;
    //总页数
    private int pageCount;
    //分页列表
    private List<T> list;
}
