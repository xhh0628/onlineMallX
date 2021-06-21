package com.xhh.onlineMall.controller;

import com.xhh.onlineMall.service.ProductService;
import com.xhh.onlineMall.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/product")
@Api(value = "提供商品信息相关接口",tags = "商品管理")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/detail-info/{pid}")
    @ApiOperation("商品基本信息查询接口")
    public ResultVO getProductBasicInfo(@PathVariable("pid") String pid){
        return productService.getProductBasicInfo(pid);
    }
}
