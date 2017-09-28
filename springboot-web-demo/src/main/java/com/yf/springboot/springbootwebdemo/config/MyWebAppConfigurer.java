package com.yf.springboot.springbootwebdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
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


    //方法一：http://localhost:8081/webapp/image/web.xml 这里可以指定外部路径
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**")
                .addResourceLocations("D:/static/");

        super.addResourceHandlers(registry);
    }

    /**
     * 我们的配置和springboot自动配置同时生效  当我们访问localhost:8088/xx 返回index页面
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/xx").setViewName("index");
    }
}