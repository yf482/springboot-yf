package com.yf.springmvc.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author yunfeng
 * @version V.1.0
 * @title
 * @Desc service
 * @create 2017-09-11 22:30
 **/
@Service
@Scope("prototype")
//@Scope("singleton")
// 默认prototype
public class FunctionServices {
    public String sayHello(String word){
        return "Hello " + word;
    }
}
