package com.chen.dao;

import com.chen.pojo.User;
import org.apache.ibatis.annotations.Param;


public interface UserMapper {
    //1.查看用户名是否重复
    User findUsersByUsername(String username);
    //2.注册
    int addUser(User user);
    //3.修改密码
    int modifyPasswordByUsername(User user);

}
