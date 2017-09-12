package com.yf.springmvc.service;

import com.yf.springmvc.anna.Action;
import org.springframework.stereotype.Service;

/**
 * @author yunfeng
 * @version V.1.0
 * @title
 * @Desc
 * @create 2017-09-11 22:52
 **/
@Service
public class AnnotationServiceDemo {

    @Action(name="test")
    public void add(){

    }
}
