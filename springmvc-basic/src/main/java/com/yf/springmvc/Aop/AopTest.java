package com.yf.springmvc.Aop;

import org.springframework.stereotype.Component;

/**
 * @author yunfeng
 * @version V.1.0
 * @title
 * @Desc
 * @create 2017-09-11 22:53
 **/
@Component
//@Aspect
public class AopTest {


    public void annotationPointCut(){}

//    @Before("execution(* com.sxit..*.*(..))")
    public void before(){
        System.out.println("方法执行前执行.....");
    }
}
