package com.star.service;

import com.star.entity.User;

/**
 * @Description: 用户业务层接口
 */
public interface UserService {

//    核对用户名和密码
    User checkUser(String username, String password);

}