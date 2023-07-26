package com.services;

import com.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public List<String> getUsers(){
        String xxx=userDao.getHello();
        System.out.print("xxx:"+xxx);


        List<String> users=new ArrayList<>();
        for (int i=0;i<10;i++){
            users.add("xxx:"+i);
        }
        return users;
    }


}
