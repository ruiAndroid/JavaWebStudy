package com.ssm2.controller;

import com.ssm2.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/getstudent")
    @ResponseBody
    public Student getStudent(){
        System.out.print("sadads");
        Student student=new Student();
        student.setName("张三");
        student.setAge(18);
        student.setGender("男");
        return student;
    }

}
