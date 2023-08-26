package springmvc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

/**
 * 异常处理
 */

//@ControllerAdvice
public class ExceptionHandler {
//    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public ModelAndView fileUploadSizeLimitException(Exception exception){
        ModelAndView modelAndView=new ModelAndView("/error");
        modelAndView.addObject("error",exception.getMessage());
        return modelAndView;


    }
}
