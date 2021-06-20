package com.xhh.onlineMall.controller;

import com.xhh.onlineMall.entity.ProductVO;
import com.xhh.onlineMall.service.CategoryService;
import com.xhh.onlineMall.service.IndexImgService;
import com.xhh.onlineMall.service.ProductService;
import com.xhh.onlineMall.vo.ResStatus;
import com.xhh.onlineMall.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/index")
@Api(value = "提供首页轮播图接口",tags = "首页管理")
public class IndexController {

    @Autowired
    private IndexImgService indexImgService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;
    /**
     * 获取首页轮播图
     * @return
     */
    @GetMapping("/indeximg")
    @ApiOperation("首页轮播图接口")
    public ResultVO selectIndexImgs(){
        return  indexImgService.selectIndexImgs();
    }

    /**
     * 获取商品分类列表
     * @param
     * @return
     */
    @GetMapping("/category-list")
    @ApiOperation("首页商品分类查询接口_连接查询实现接口")
    public ResultVO selectListCategories(){
        return categoryService.selectListCategories();
    }

    /**
     * 获取商品分类列表
     * @param parentId
     * @return
     */
    @GetMapping("/category-list2")
    @ApiOperation("首页商品分类查询接口_子查询实现接口")
    public ResultVO selectListCategories2(@RequestParam("parentId") int parentId){
        return categoryService.selectListCategories2(parentId);
    }

    /**
     * 获取推荐商品
     * @return
     */
    @GetMapping("/recommend-list")
    @ApiOperation("新品推荐商品接口")
    public ResultVO selectRecommendProductsList() {
        return productService.selectRecommendProductsList();
    }

    /**
     * 查询一级分类，同时查询一级分类下销量最高的6个商品
     */
    @GetMapping("/category-recommend")
    @ApiOperation("分类推荐商品接口")
    public ResultVO selectRecommendProductsByCategory() {
        return categoryService.selectListFirstLevelCategories();
    }
}
