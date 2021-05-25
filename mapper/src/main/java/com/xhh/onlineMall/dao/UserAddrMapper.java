package com.xhh.onlineMall.dao;

import com.xhh.onlineMall.entity.UserAddr;
import com.xhh.onlineMall.entity.UserAddrExample;
import com.xhh.onlineMall.general.GeneralDao;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAddrMapper extends GeneralDao<UserAddr> {
    int countByExample(UserAddrExample example);

    int deleteByExample(UserAddrExample example);

    List<UserAddr> selectByExample(UserAddrExample example);

    int updateByExampleSelective(@Param("record") UserAddr record, @Param("example") UserAddrExample example);

    int updateByExample(@Param("record") UserAddr record, @Param("example") UserAddrExample example);
}