package com.yf.springmvc.doConfig;

import com.yf.springmvc.service.BeanService;
import com.yf.springmvc.service.ProfileService;
import com.yf.springmvc.service.ProfileService2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

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
public class ProfileConfigure {


    @Bean
    @Profile("dev")
    ProfileService profileService(){
        return new ProfileService("dev");
    }

    @Bean
    @Profile("test")
    ProfileService2 profileService2(){
        return new ProfileService2("dev");
    }
}
