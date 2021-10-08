package com.chen.service;

import com.chen.pojo.User;

public interface UserService {
    //1.通过用户名获取用户信息
    User findUsersByUsername(String username);
    //2.注册
    int addUser(User user);
    //3.修改密码
    int modifyPasswordByUsername(User user);
    //4.查看用户名是否存在
    boolean isUserExist(String username);
    //5.根据提供的用户名拿密码
    String getPasswordByUsername(String username);


}
