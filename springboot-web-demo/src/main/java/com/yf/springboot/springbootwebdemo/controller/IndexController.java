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

    @RequestMapping("/index")
    public String getPersonList(){
        return "index";
    }
}
