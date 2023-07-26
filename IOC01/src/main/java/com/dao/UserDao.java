package com.dao;


import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public String getHello(){
        return "hello";
    }
}
