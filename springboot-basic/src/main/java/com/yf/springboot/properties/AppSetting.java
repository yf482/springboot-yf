package com.yf.springboot.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author yunfeng
 * @version V.1.0
 * @title
 * @Desc
 * @create 2017-09-25 22:12
 **/
@Component
@ConfigurationProperties(prefix = "yunfeng")
public class AppSetting {

    private String name;
    private int age;
    @Value("${yf.path:haha}")
    private String path;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "appSetting{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", path='" + path + '\'' +
                '}';
    }
}
