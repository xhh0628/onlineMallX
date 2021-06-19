package com.xhh.onlineMall.controller;

import com.xhh.onlineMall.service.CategoryService;
import com.xhh.onlineMall.service.IndexImgService;
import com.xhh.onlineMall.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/index")
@Api(value = "提供首页轮播图接口",tags = "首页管理")
public class IndexController {

    @Autowired
    private IndexImgService indexImgService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/indeximg")
    @ApiOperation("首页轮播图接口")
    public ResultVO selectIndexImgs(){
        return  indexImgService.selectIndexImgs();
    }


    @GetMapping("/category-list")
    @ApiOperation("首页商品分类查询接口_连接查询实现接口")
    public ResultVO selectListCategories(){
        return categoryService.selectListCategories();
    }

    @GetMapping("/category-list2")
    @ApiOperation("首页商品分类查询接口_子查询实现接口")
    public ResultVO selectListCategories2(@RequestParam("parentId") int parentId){
        return categoryService.selectListCategories2(parentId);
    }
}
