package com.xhh.onlineMall.controller;


import com.xhh.onlineMall.service.UserService;
import com.xhh.onlineMall.vo.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@ResponseBody
@RequestMapping(value = "/user")
public class UserController {

 @Resource
    private UserService userService;


    @RequestMapping(value = "/login")
    public ResultVO login(String name,String pwd){
        return userService.checkLogin(name,pwd);
    }
}
