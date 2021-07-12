package com.xhh.onlineMall.service;

import com.xhh.onlineMall.vo.ResultVO;

public interface UserAddrService {


    ResultVO listAddrsByUserId(int userId);
}
