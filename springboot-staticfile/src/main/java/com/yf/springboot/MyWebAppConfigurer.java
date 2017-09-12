package com.yf.springboot;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author yunfeng
 * @version V.1.0
 * @title
 * @Desc
 * @create 2017-09-12 23:37
 **/
@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/src/main/webapp/**").addResourceLocations("classpath:/webapp/");
        super.addResourceHandlers(registry);
    }
}