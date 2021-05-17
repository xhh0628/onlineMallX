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
        //返回前端对象
        ResultVO vo;
        //判断是否存在
        if (user!=null){
            if (pwd.equals(user.getUserPwd())){
                vo=  new ResultVO(1000,"登录成功",user);
            }else {
                vo=   new ResultVO(1001,"密码错误",null);
            }
        }else{
            vo= new ResultVO(1001,"用户不存在",null);
        }
        return vo;
    }
}
