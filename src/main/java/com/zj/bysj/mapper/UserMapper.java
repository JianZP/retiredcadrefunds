package com.zj.bysj.mapper;

import com.zj.bysj.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> selAll(String username,String password);

    List<User> selByUser(String username);

    int insUser(User user);

}
