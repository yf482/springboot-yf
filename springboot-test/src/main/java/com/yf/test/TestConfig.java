package com.yf.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author yunfeng
 * @version V.1.0
 * @title
 * @Desc
 * @create 2017-09-19 22:33
 **/
@Configuration
public class TestConfig {

    @Bean
    @Profile("dev")
    public TestBean devTestBean(){
        return new TestBean("dev");
    }
    @Bean
    @Profile("prod")
    public TestBean prodTestBean(){
        return new TestBean("prod");
    }

}
