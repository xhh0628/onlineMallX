package com.xhh.onlineMall.controller;

import com.auth0.jwt.impl.JWTParser;
import com.xhh.onlineMall.entity.ShoppingCart;
import com.xhh.onlineMall.service.ShoppingCartService;
import com.xhh.onlineMall.service.impl.ShoppingCartServiceImpl;
import com.xhh.onlineMall.vo.ResStatus;
import com.xhh.onlineMall.vo.ResultVO;
import io.jsonwebtoken.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shopcart")
@CrossOrigin
@Api(value ="购物车接口",tags = "购物车管理")
public class ShopcartController {

    @Autowired
    private ShoppingCartService shoppingCartService;

/*    @GetMapping("/list")
    @ApiOperation("获取购物车列表接口")
    public ResultVO listcarts(){
            //获取购物车列表，私密资源，拦截器校验token
            return new ResultVO(ResStatus.OK,"sucess",null);
        }*/


    @PostMapping("/add")
    @ApiOperation("获取购物车列表接口")
    public ResultVO addShoppingCart(@RequestBody ShoppingCart cart){

        ResultVO vo = shoppingCartService.addShoppingCart(cart);
        return vo;
    }
}

