package com.zj.bysj.service;

import com.zj.bysj.pojo.User;

import java.util.List;

public interface OptionUser {

    List<User> selUser(String username,String password);

    List<User> selUsers(String username);

    int adduser(User user);
}
