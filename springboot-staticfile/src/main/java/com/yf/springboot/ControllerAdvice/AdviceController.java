package com.yf.springboot.ControllerAdvice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yunfeng
 * @version V.1.0
 * @title
 * @Desc
 * @create 2017-09-21 22:33
 **/
@Controller
public class AdviceController {
    //http://localhost:8081/advice?id=123&name=abc
    @RequestMapping("/advice")
    public  String getSomething (@ModelAttribute("msg") String msg,DemoObj demoObj){
        throw  new IllegalArgumentException(" 参数不对 来自ModelAttribute：" + msg);
    }


    //http://localhost:8081/advice?id=123&name=abc
    @RequestMapping("/test")
    @ResponseBody
    public  DemoObj getSomething (DemoObj demoObj){
        return demoObj;
    }
}
