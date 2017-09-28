package com.yf.springboot.springbootwebdemo.controller;

import com.google.gson.Gson;
import com.yf.springboot.springbootwebdemo.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/person")
public class IndexController {

    /**
     * 当我们吧index.html放在如下路径时候 访问localhost:8088会自动访问
     * classpath:/META-INF/resources/index.html
     * classpath:/resources/index.html
     * classpath:/static/index.html
     * classpath:/public/static/index.html
     * @return
     */
    @RequestMapping("/index")
    public String getPersonList(){
        return "index";
    }
}
