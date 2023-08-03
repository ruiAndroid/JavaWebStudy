package springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/book")
public class BookController {

    @PostMapping("/getbook")
    public ModelAndView getBook(){
        return new ModelAndView("/hello");
    }



}

