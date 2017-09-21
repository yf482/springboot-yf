package com.yf.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yunfeng
 * @version V.1.0
 * @title
 * @Desc
 * @create 2017-09-21 20:57
 **/
@Controller
public class HelloController {
    @RequestMapping("/index")
    public String Hello(){
        return "index";
    }
}
