package com.yf.springboot.properties;

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
@ConfigurationProperties(locations = {"classpath:test.properties"},prefix = "author")
public class AuthorSetting {

    private String name;
    private int age;



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

    @Override
    public String toString() {
        return "AuthorSetting{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
