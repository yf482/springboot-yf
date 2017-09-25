package com.yf.springboot.ControllerAdvice;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author yunfeng
 * @version V.1.0
 * @title
 * @Desc
 * @create 2017-09-21 22:28
 **/
@ControllerAdvice //1
public class ExceptionAdvice {
    //设置错误返回视图
    @ExceptionHandler(value = Exception.class) //2
    public ModelAndView exception(Exception exception, WebRequest webRequest){
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMsg:" ,exception.getMessage());
        return modelAndView;
    }
    //全部@RequestMapping请求通过注解获取属性
    @ModelAttribute //3
    public void addAttributes(Model model){
        model.addAttribute("msg","msg info");

    }
    //请求排除相应字段属性
//    @InitBinder //4
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.setDisallowedFields("id");
    }



}
