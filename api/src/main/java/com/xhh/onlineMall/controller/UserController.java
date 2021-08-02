package com.xhh.onlineMall.controller;


import com.xhh.onlineMall.entity.Users;
import com.xhh.onlineMall.service.UserService;
import com.xhh.onlineMall.vo.ResStatus;
import com.xhh.onlineMall.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@ResponseBody
@RequestMapping(value = "/user")
@CrossOrigin
@Api(value ="用户接口",tags = "用户接口")
public class UserController {

    @Resource
    private UserService userService;


    @GetMapping(value = "/login")
    @ApiOperation("用户登录接口")
    public ResultVO login(@RequestParam("username") String username,
                          @RequestParam("password") String password){
        //验证登录
        ResultVO vo=userService.checkLogin(username,password);
        return vo;
    }

    @PostMapping(value = "/regist")
    @ApiOperation("用户注册接口")
    public ResultVO regist(@RequestBody Users user){
        ResultVO vo=userService.userResgit(user.getUsername(),user.getPassword());
        return vo;
    }

    /**
     * 借助拦截器，校验token是否过期
     * @param token
     * @return
     */
    @GetMapping(value = "/tokenCheck")
    @ApiOperation("token校验是否过期接口")
    public ResultVO userTokenCheck(@RequestHeader("token")String token){

        return  new ResultVO(ResStatus.OK,"success",null);
    }

}
