package com.xhh.onlineMall.controller;

import com.xhh.onlineMall.service.ProductCommentsService;
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
    @Autowired
    private ProductCommentsService productCommentsService;

    @GetMapping("/detail-info/{pid}")
    @ApiOperation("商品基本信息查询接口")
    public ResultVO getProductBasicInfo(@PathVariable("pid") String pid){
        return productService.getProductBasicInfo(pid);
    }

    @GetMapping("/detail-params/{pid}")
    @ApiOperation("商品参数信息查询接口")
    public ResultVO getProductParams(@PathVariable("pid") String pid){
        return productService.getProductParamsById(pid);
    }

    @GetMapping("/detail-comments/{pid}")
    @ApiOperation("商品评论列表信息查询接口")
    public ResultVO getProductComments(@PathVariable("pid") String pid,int pageNum,int limit){
        return productCommentsService.listCommentsByProductId(pid,pageNum,limit);
    }
    @GetMapping("/detail-commentsCount/{pid}")
    @ApiOperation("商品获取评论数和好评率接口")
    public ResultVO getProductCommentsCount(@PathVariable("pid") String pid){
        return productCommentsService.gerCommentsCountByProductId(pid);
    }

    @GetMapping("/listbycid/{cid}")
    @ApiOperation("根据类别查询商品接口")
    public ResultVO getProductsByCategoryId(@PathVariable("cid") int cid,int pageNum,int limit){
        return productService.getProductsByCategoryId(cid,pageNum,limit);
    }

    @GetMapping("/listbrands/{cid}")
    @ApiOperation("根据类别查询该类别下商品品牌")
    public ResultVO getBrandsByCategoryId(@PathVariable("cid") int cid){
        return productService.listBrands(cid);
    }

}
