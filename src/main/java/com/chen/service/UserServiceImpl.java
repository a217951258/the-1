package com.chen.service;

import com.chen.dao.UserMapper;
import com.chen.pojo.User;
import com.sun.xml.internal.ws.runtime.config.TubelineFeatureReader;

public class UserServiceImpl implements UserService {

    //整合接口
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    //判断用户是否存在
    @Override
    public boolean isUserExist(String username) {
       if(userMapper.findUsersByUsername(username) == null){
           return false;
       }
       else {
           return true;
       }
    }

    //根据提供的用户名拿密码
    @Override
    public String getPasswordByUsername(String username) {
        User usersByUsername = userMapper.findUsersByUsername(username);
        return usersByUsername.getPassword();
    }

    @Override
    public User findUsersByUsername(String username) {
        return userMapper.findUsersByUsername(username);
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);

    }

    @Override
    public int modifyPasswordByUsername(User user) {
        return userMapper.modifyPasswordByUsername(user);
    }
}
