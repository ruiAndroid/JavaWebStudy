package com.ssm2.mapper;

import com.ssm2.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    Integer addUser(@Param("user") User user);
    List<User> getAllUser();
    List<User> getUserByPage(@Param("start") Integer start,@Param("size") Integer size);

    List<User> getUserByNameOrId(@Param("user") User user);
    List<User> getUserByNameOrId2(@Param("user") User user);
    List<User> getUserByNameOrId3(@Param("user") User user);

    List<User> getUserByIds(@Param("ids") List<Integer> ids);
    void updateUserNameById(String username,int id);
    Integer updateUser(@Param("user") User user);
    Integer batchAddUser(@Param("users") List<User> users);

    List<User> getAllUserWithRole();



}
