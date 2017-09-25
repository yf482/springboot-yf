package com.yf.springmvc.doConfig;

import com.yf.springmvc.service.BeanService;
import com.yf.springmvc.service.ProfileService;
import com.yf.springmvc.service.ProfileService2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;

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
@EnableScheduling //开启对计划任务的支持
public class SpringConfigure {

    @Bean(initMethod = "init" , destroyMethod = "destroy")
    BeanService beanService(){
        return new BeanService();
    }

}
