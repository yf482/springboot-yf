package com.yf.springboot.springbootwebdemo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Component
public class DemoConfig {
    private String prefix = "";
    private String suffix = "html";

    @Bean
    @ConditionalOnMissingBean(InternalResourceViewResolver.class)
    public InternalResourceViewResolver defaultViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setSuffix(this.suffix);
//        resolver.setPrefix(this.prefix);
        return resolver;
    }

    //跟静态资源无关
   /* public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/classes/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }*/
}