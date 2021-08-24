package com.xhh.onlineMall.service.impl;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xhh.onlineMall.dao.CategoryMapper;
import com.xhh.onlineMall.entity.CategoryVO;
import com.xhh.onlineMall.entity.IndexImg;
import com.xhh.onlineMall.service.CategoryService;
import com.xhh.onlineMall.vo.ResStatus;
import com.xhh.onlineMall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    private ObjectMapper objectMapper=new ObjectMapper();

    @Override
    public ResultVO selectListCategories() {
        try {
            //商品列表redis化
            List<CategoryVO> categoryVOS=null;
            String categories = stringRedisTemplate.boundValueOps("categories").get();
            if (categories!=null){
                JavaType javaType=objectMapper.getTypeFactory().constructParametricType(ArrayList.class, CategoryVO.class);
                categoryVOS= objectMapper.readValue(categories, javaType);
            }else{
                //通过同步锁解决高并发请求redis击穿，（双重检测锁
                synchronized (this){//同步锁service实例，串行并发请求
                    //二次查询redis，判断是否访问数据库
                    String categories2 = stringRedisTemplate.boundValueOps("categories").get();
                    if (categories2==null){
                        //高并发请求只有第一个会请求数据库
                        categoryVOS = categoryMapper.selectAllCategories();
                        //数据库查询结果存入redis
                        stringRedisTemplate.boundValueOps("categories").set(objectMapper.writeValueAsString(categoryVOS),1, TimeUnit.DAYS);
                    }else{
                        JavaType javaType=objectMapper.getTypeFactory().constructParametricType(ArrayList.class, CategoryVO.class);
                        categoryVOS= objectMapper.readValue(categories2, javaType);
                    }
                }
            }
            if(categoryVOS!=null){
                return new ResultVO(ResStatus.OK, "success", categoryVOS);
            }else{
                return  new ResultVO(ResStatus.OK, "file", null);
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
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
