package com.xhh.onlineMall.service;

import com.xhh.onlineMall.vo.ResultVO;

public interface UserService {

    ResultVO checkLogin(String name, String pwd);
}
