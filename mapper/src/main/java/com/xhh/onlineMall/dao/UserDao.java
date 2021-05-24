package com.xhh.onlineMall.dao;


import com.xhh.onlineMall.entity.User;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;


public interface UserDao extends Mapper<User>, MySqlMapper<User> {

     User queryUserByName(String name);
}
