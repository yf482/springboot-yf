package com.yf.springmvc.controller;

import com.yf.springmvc.service.FunctionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author yunfeng
 * @version V.1.0
 * @title
 * @Desc
 * @create 2017-09-11 22:32
 **/
@Controller

public class FunctionCtroller {

    @Autowired
    FunctionServices functionServices;

    public String sayWord(){
        return functionServices.sayHello("dede");
    }
}
