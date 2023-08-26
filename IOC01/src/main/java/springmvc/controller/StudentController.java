package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springmvc.bean.Student;

import java.util.List;


@Controller
@RequestMapping("/student")
public class StudentController {

//    @ResponseBody
//    public void addStudent(@Validated Student student, BindingResult result){
//        if (result.hasErrors()){
//            List<ObjectError> allErrors = result.getAllErrors();
//            System.out.print("allErrors:"+allErrors.toString());
//        }
//        System.out.print("addStudent student:"+student.toString());
//    }

    @GetMapping("/getstudent")
    @ResponseBody
    public Student getStudent(){
        Student student=new Student();
        student.setName("张三");
        student.setEmail("111");
        student.setAge(12);
        return student;

    }

}
