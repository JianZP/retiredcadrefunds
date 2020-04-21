package com.zj.bysj.service.impl;

import com.zj.bysj.mapper.UserMapper;
import com.zj.bysj.pojo.User;
import com.zj.bysj.service.OptionUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class OptionUserImpl implements OptionUser {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> selUser(String username,String password) {
        return userMapper.selAll(username,password);
    }

    @Override
    public List<User> selUsers(String username) {
        return userMapper.selByUser(username);
    }

    @Override
    public int adduser(User user) {
        return userMapper.insUser(user);
    }
}
