package springmvc.controller;


import com.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/getuser")
    @ResponseBody
    public void getUser(){
        System.out.print("adasdsd");
    }


    @RequestMapping(value = "/user",produces = "text/html;charset=utf-8")
    public String addUser(){
        return "/addUser";
    }


    /**
     * 添加一个user
     */
    @PostMapping("/adduser" )
    @ResponseBody
    public void doAddUser(@RequestParam("userName") String userName,@RequestParam("gender") String gender){
        System.out.print("addUser userName:"+userName);
        System.out.print(",addUser gender:"+gender);


    }

    @PostMapping("/adduser2")
    @ResponseBody
    public void addUser2(User user){
        System.out.print("addUser2 :"+user.toString());
    }

}

