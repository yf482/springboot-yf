package com.yf.springmvc.service;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author yunfeng
 * @version V.1.0
 * @title
 * @Desc
 * @create 2017-09-18 22:36
 **/
//@Async
@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(Integer i){
        System.out.println("i:" + i);
    }
    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("i2:" + (i+1));
    }
}
