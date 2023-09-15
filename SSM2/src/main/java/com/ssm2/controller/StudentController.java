package com.ssm2.controller;

import com.ssm2.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/get-student")
    @ResponseBody
    public Student getStudent(){
        Student student=new Student();
        student.setName("张三");
        student.setAge(18);
        student.setGender("男");
        return student;
    }

    @PostMapping("/add-student")
    @ResponseBody
    public Student addStudent(@RequestBody Student student){
        return student;

    }

}
