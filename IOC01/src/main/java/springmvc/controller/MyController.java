package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import springmvc.service.HelloService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@org.springframework.stereotype.Controller("/hello")
public class MyController implements Controller {

    /**
     * 请求处理接口
     * @param httpServletRequest 前端发送来的请求
     * @param httpServletResponse 服务端给前端的响应
     * @return 返回值是一个ModelAndView, model相当于数据模型,View是视图
     * @throws Exception
     */
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv=new ModelAndView("/hello");
        mv.addObject("name","rui");
        return mv;
    }
}
