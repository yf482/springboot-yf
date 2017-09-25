package com.yf.springmvc;

import com.yf.springmvc.doConfig.ProfileConfigure;
import com.yf.springmvc.doConfig.SpringConfigure;
import com.yf.springmvc.el.ELConfig;
import com.yf.springmvc.service.AsyncTaskService;
import com.yf.springmvc.service.BeanService;
import com.yf.springmvc.service.FunctionServices;
import com.yf.springmvc.service.ProfileService;
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


       //EL
       /*ELConfig elConfig = context.getBean(ELConfig.class);
       System.out.println("elConfig = " + elConfig);
       elConfig.outPutResource();*/

       //bean
        /*BeanService beanService = context.getBean(BeanService.class);
        System.out.println("beanService = " + beanService);*/

        //profile
////        context.getEnvironment().setActiveProfiles("dev");
//        context.register(ProfileConfigure.class);
////        context.refresh();
//        ProfileService profileService = context.getBean(ProfileService.class);
//        System.out.println("profileService = " + profileService.toString());


      /*  AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 100; i++) {
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }

*/
      //开启计划 context不要close
     /* SpringConfigure springConfigure = context.getBean(SpringConfigure.class);

//        context.close();
*/
     context.close();



    }
}
