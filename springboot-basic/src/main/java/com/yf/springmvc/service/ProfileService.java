package com.yf.springmvc.service;

/**
 * @author yunfeng
 * @version V.1.0
 * @title
 * @Desc
 * @create 2017-09-14 23:14
 **/
public class ProfileService {

    private String name;

    public ProfileService() {
        super();
    }

    public ProfileService(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init(){
        System.out.println("init");
    }

    public void destroy(){
        System.out.println("destroy");
    }

    @Override
    public String toString() {
        return "ProfileService{" +
                "name='" + name + '\'' +
                '}';
    }
}
