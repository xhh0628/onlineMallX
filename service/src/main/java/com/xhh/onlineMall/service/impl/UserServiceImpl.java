package com.xhh.onlineMall.service.impl;

import com.xhh.onlineMall.dao.UserDao;
import com.xhh.onlineMall.entity.User;
import com.xhh.onlineMall.service.UserService;
import com.xhh.onlineMall.vo.ResultVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public ResultVO checkLogin(String name, String pwd) {
        //根据登录账号查询用户信息
        User user = userDao.queryUserByName(name);
        //判断是否存在
        return null;
    }
}
