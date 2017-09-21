package com.yf.mvc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @author yunfeng
 * @version V.1.0
 * @title
 * @Desc
 * @create 2017-09-19 22:40
 **/
public class WebInitializer implements WebApplicationInitializer {


    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigApplicationContext ctx  = new AnnotationConfigApplicationContext();
        ctx.register(MyMvcConfig.class);
//        ctx.setServletContext(servletContext);
        ctx.setParent(ctx);
        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet());
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }
}
