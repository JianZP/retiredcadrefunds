package com.zj.bysj.controller;

import com.zj.bysj.pojo.User;
import com.zj.bysj.service.OptionUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class LoginController {
    @Resource
    private OptionUser optionUser;
    @RequestMapping("/login")
    public List<User> login(String username,String password){
        if(optionUser.selUser(username,password).size()!=0){
            return optionUser.selUser(username,password);
        }else{
            User user=new User();
            user.setIsadmin("无");
            List<User> users=new ArrayList<>();
            users.add(user);
            return users;
        }


    }
    @RequestMapping("/check")
    public List<User> check(String username){
        return optionUser.selUsers(username);
    }

    @RequestMapping("/register")
    public int register(String username,String password,String name,String sex,int age,String address,String contactway,int belongpartyid){
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setIsadmin("否");
        user.setName(name);
        user.setSex(sex);
        user.setAge(age);
        user.setAddress(address);
        user.setContactway(contactway);
        user.setBelongpartyid(belongpartyid);
        optionUser.adduser(user);
        return 300;
    }
}
