package com.xhh.onlineMall.controller;


import com.xhh.onlineMall.entity.Users;
import com.xhh.onlineMall.service.UserService;
import com.xhh.onlineMall.vo.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@ResponseBody
@RequestMapping(value = "/user")
@CrossOrigin
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
    public ResultVO regist(@RequestBody Users user){

        ResultVO vo=userService.userResgit(user.getUsername(),user.getPassword());
        return vo;
    }

}
