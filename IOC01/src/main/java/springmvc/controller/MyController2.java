package springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController2 {

    @RequestMapping("/hello2")
    public ModelAndView hello(){
        return new ModelAndView("/hello2");
    }

}

