package com.xhh.onlineMall.dao;

import com.xhh.onlineMall.entity.Category;
import com.xhh.onlineMall.entity.CategoryExample;
import com.xhh.onlineMall.general.GeneralDao;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategoryMapper extends GeneralDao<Category> {
    int countByExample(CategoryExample example);

    int deleteByExample(CategoryExample example);

    List<Category> selectByExample(CategoryExample example);

    int updateByExampleSelective(@Param("record") Category record, @Param("example") CategoryExample example);

    int updateByExample(@Param("record") Category record, @Param("example") CategoryExample example);
}