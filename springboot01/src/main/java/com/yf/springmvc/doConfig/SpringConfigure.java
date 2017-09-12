package com.yf.springmvc.doConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 使用@ComponentScan 注解可以扫描包下面的。Service、Controller、Component。Repository。注册成bean
 *
 * @author yunfeng
 * @version V.1.0
 * @title
 * @Desc
 * @create 2017-09-11 22:35
 **/
@Configuration
@ComponentScan("com.yf.springmvc")
public class SpringConfigure {
}
