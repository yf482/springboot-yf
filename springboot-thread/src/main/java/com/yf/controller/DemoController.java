package com.yf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

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

    @Autowired
    AsyncDemo asyncDemo;

    @RequestMapping(value = "/demo1",produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String test1(int id,String name){
        String str = id + ":" + name;
        return str;
    }

    @RequestMapping(value = "/demo2",produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String demo2(){
        asyncDemo.asyncInvokeSimplest();
//        asyncDemo.asyncInvokeWithException("test");
        Future<String> future = asyncDemo.asyncInvokeReturnFuture(100);
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        return "success";
    }

}
