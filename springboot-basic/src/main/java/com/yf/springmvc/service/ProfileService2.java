package com.yf.springmvc.service;

/**
 * @author yunfeng
 * @version V.1.0
 * @title
 * @Desc
 * @create 2017-09-14 23:14
 **/
public class ProfileService2 {

    private String name;

    public ProfileService2() {
        super();
    }

    public ProfileService2(String name) {
        this.name = name;
    }

    public void init(){
        System.out.println("init");
    }

    public void destroy(){
        System.out.println("destroy");
    }
}
