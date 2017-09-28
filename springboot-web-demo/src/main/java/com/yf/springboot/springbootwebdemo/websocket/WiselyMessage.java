package com.yf.springboot.springbootwebdemo.websocket;

/**
 * @author yunfeng
 * @version V.1.0
 * @title
 * @Desc
 * @create 2017-09-28 23:13
 **/
public class WiselyMessage {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "WiselyMessage{" +
                "name='" + name + '\'' +
                '}';
    }
}
