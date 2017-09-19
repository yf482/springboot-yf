package com.yf.springmvc.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yunfeng
 * @version V.1.0
 * @title
 * @Desc
 * @create 2017-09-18 22:42
 **/
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void printStr(){
        System.out.println("5 s exe ; " + simpleDateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 28 11 ? * *")
    public void printStr2(){
        System.out.println("5 s exe ; " + simpleDateFormat.format(new Date()));
    }
}
