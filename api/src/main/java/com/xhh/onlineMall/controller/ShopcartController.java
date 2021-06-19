package com.xhh.onlineMall.controller;

import com.auth0.jwt.impl.JWTParser;
import com.xhh.onlineMall.vo.ResStatus;
import com.xhh.onlineMall.vo.ResultVO;
import io.jsonwebtoken.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shopcart")
@CrossOrigin
@Api(value ="购物车接口",tags = "购物车管理")
public class ShopcartController {

    @GetMapping("/list")
    @ApiOperation("获取购物车列表接口哦")
    public ResultVO listcarts(){
            //获取购物车列表，私密资源，拦截器校验token
            return new ResultVO(ResStatus.OK,"sucess",null);
        }


}

