package com.xhh.onlineMall.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int userId;
    private String userName;
    private String userPwd;
    private String userRealName;
}
