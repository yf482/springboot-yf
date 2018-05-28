package com.yf.springboot.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author yunfeng
 * @version V.1.0
 * @title
 * @Desc
 * @create 2017-09-24 12:21
 **/
@RequestMapping("/test")
@Controller
public class DemoController {

    @RequestMapping(value = "/demo1",produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String test1(int id, String name, HttpSession session){
        String str = id + ":" + name;
        session.setAttribute("name","123");
        String sessionId = session.getId();
        return str + " sessionId:"+ sessionId;
    }
}
