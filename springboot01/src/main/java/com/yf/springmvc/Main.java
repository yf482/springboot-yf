package com.yf.springmvc;

import com.yf.springmvc.doConfig.SpringConfigure;
import com.yf.springmvc.el.ELConfig;
import com.yf.springmvc.service.FunctionServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yunfeng
 * @version V.1.0
 * @title
 * @Desc springMain
 * @create 2017-09-11 22:37
 **/

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigure.class);

       /* FunctionServices functionServices = context.getBean(FunctionServices.class);
        System.out.println("functionServices = " + functionServices);
        System.out.println("functionServices = " + functionServices.sayHello("dede"));
        FunctionServices functionServices2 = context.getBean(FunctionServices.class);
        System.out.println("functionServices2 = " + functionServices2);
        System.out.println("functionServices = " + functionServices2.sayHello("dede"));
       */


       ELConfig elConfig = context.getBean(ELConfig.class);
       System.out.println("elConfig = " + elConfig);
       elConfig.outPutResource();



        context.close();


    }
}
