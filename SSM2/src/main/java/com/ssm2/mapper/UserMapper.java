package com.ssm2.mapper;

import com.ssm2.bean.User;

import java.util.List;

public interface UserMapper {

    Integer addUser(User user);
    List<User> getAllUser();

    void updateUserNameById(String username,int id);


}
