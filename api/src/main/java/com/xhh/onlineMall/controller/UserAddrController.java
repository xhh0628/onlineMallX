package com.xhh.onlineMall.controller;

import com.xhh.onlineMall.service.UserAddrService;
import com.xhh.onlineMall.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/useraddr")
@CrossOrigin
@Api(value ="提供收货人地址相关接口",tags = "收货地址管理")
public class UserAddrController {

    @Autowired
    private UserAddrService userAddrService;

    @GetMapping("/list")
    @ApiOperation("获取收货人所有地址")
    public ResultVO getProductCommentsCount(@RequestParam("userId")Integer userId,@RequestHeader("token")String token){
        ResultVO vo = userAddrService.listAddrsByUserId(userId);
        return vo;
    }
}
