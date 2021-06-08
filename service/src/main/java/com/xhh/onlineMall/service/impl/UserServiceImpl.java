package com.xhh.onlineMall.service.impl;

import com.xhh.onlineMall.dao.UsersMapper;
import com.xhh.onlineMall.entity.Users;
import com.xhh.onlineMall.entity.UsersExample;
import com.xhh.onlineMall.service.UserService;
import com.xhh.onlineMall.utils.Base64Utils;
import com.xhh.onlineMall.utils.MD5Utils;
import com.xhh.onlineMall.vo.ResStatus;
import com.xhh.onlineMall.vo.ResultVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UsersMapper usersMapper;

    //用户登录
    @Override
    public ResultVO checkLogin(String name, String pwd) {
        //根据登录账号查询用户信息
        UsersExample usersExample=new UsersExample();
        usersExample.createCriteria()
                .andUsernameEqualTo(name);
        List<Users> users=usersMapper.selectByExample(usersExample);
        String md5Pwd= MD5Utils.md5(pwd);
        //判断是否存在
        if (users.size()==1){
            if (md5Pwd.equals(users.get(0).getPassword())){
                //登录成功则生成token
                String token= Base64Utils.encode(name+"123456");
                return new ResultVO(ResStatus.OK,token,users.get(0));
            }else {
                return new ResultVO(ResStatus.NO,"密码错误",null);
            }
        }else{
            return new ResultVO(ResStatus.NO,"用户不存在",null);
        }

    }

    //用户注册
    //为一个事务
   @Transactional
    public ResultVO userResgit(String name, String pwd) {//账户名（昵称），密码
        //根据账号名查询是否被注册过
        UsersExample usersExample=new UsersExample();
        usersExample.createCriteria()
                .andUsernameEqualTo(name);
        List<Users> users=usersMapper.selectByExample(usersExample);

        //如果没有被注册过则保存
        if (users.size()==0){
            String md5Pwd= MD5Utils.md5(pwd);
            Users user=new Users();
            user.setUsername(name);
            user.setPassword(md5Pwd);
            user.setUserImg("1.jpg");
            user.setUserRegtime(new Date());
            user.setUserModtime(user.getUserRegtime());
            int i=usersMapper.insertUseGeneratedKeys(user);//新增后主键回填
            if (i>0){
               return new ResultVO(ResStatus.OK,"注册成功！",user);//注册成功返回user对象
            }else {
                return new ResultVO(ResStatus.NO,"注册失败！",null);
            }
        }else {
            //返回提示已被注册
            return new ResultVO(ResStatus.NO,"用户名已被注册！",null);
        }

    }
}
