package com.xhh.onlineMall.dao;

import com.xhh.onlineMall.entity.Users;
import com.xhh.onlineMall.entity.UsersExample;
import com.xhh.onlineMall.general.GeneralDao;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersMapper extends GeneralDao<Users> {
    int countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    List<Users> selectByExample(UsersExample example);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);
}