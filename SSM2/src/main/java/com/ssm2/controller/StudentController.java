package com.ssm2.controller;

import com.ssm2.bean.Student;
import com.ssm2.bean.User;
import com.ssm2.mapper.UserMapper;
import com.ssm2.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/get-student")
    @ResponseBody
    public List<User> getStudent(){


        SqlSessionFactory factory = SqlSessionUtils.getInstance();

        SqlSession sqlSession = factory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users=userMapper.getAllUser();
        System.out.print(users.toString());

        return users;
    }

    @PostMapping("/add-student")
    @ResponseBody
    public Student addStudent(@RequestBody Student student){
        return student;

    }


    @PostMapping("/test-student")
    @ResponseBody
    public Student testStudent(String name){
        Student student=new Student();
        student.setName(name);
        student.setAge(18);
        student.setGender("男");
        return student;

    }

}
