package com.yf.springmvc.service;

/**
 * @author yunfeng
 * @version V.1.0
 * @title
 * @Desc
 * @create 2017-09-14 23:14
 **/
public class BeanService {

    private String name;
    public BeanService() {
        super();
    }

    public BeanService(String name) {
        this.name = name;
    }

    public void init(){
        System.out.println("init");
    }

    public void destroy(){
        System.out.println("destroy");
    }
}
