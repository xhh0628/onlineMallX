package com.xhh.onlineMall.dao;


import com.xhh.onlineMall.entity.User;


public interface UserDao {

     User queryUserByName(String name);
}
