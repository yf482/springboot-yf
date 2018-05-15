package com.test;

import com.yf.MyApplication;
import com.yf.controller.AsyncDemo;
import com.yf.controller.AsyncExceptionDemo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author yunfeng
 * @version V.1.0
 * @title
 * @Desc
 * @create 2018-05-16 0:16
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes=MyApplication.class)
public class TestThread2 {
    @Autowired
    private AsyncExceptionDemo asyncDemo;

    @Test
    public void contextLoads() throws InterruptedException, ExecutionException {
        asyncDemo.asyncInvokeSimplest();
        asyncDemo.asyncInvokeWithException("test");
        Future<String> future = asyncDemo.asyncInvokeReturnFuture(100);
        System.out.println(future.get());
    }
}