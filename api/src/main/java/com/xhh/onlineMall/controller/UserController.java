package com.xhh.onlineMall.controller;


import com.xhh.onlineMall.entity.Users;
import com.xhh.onlineMall.service.UserService;
import com.xhh.onlineMall.vo.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/user")
public class UserController {

 @Resource
    private UserService userService;


    @GetMapping(value = "/login")
    public ResultVO login(@RequestParam("username") String username,
                          @RequestParam("password") String password){

        ResultVO vo=userService.checkLogin(username,password);
        return vo;
    }

    @PostMapping(value = "/regist")
    public ResultVO regist(String username,String password){
        ResultVO vo=userService.userResgit(username,password);
        return vo;
    }

}
