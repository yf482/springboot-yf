package com.yf.springboot.properties;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author yunfeng
 * @version V.1.0
 * @title
 * @Desc
 * @create 2017-09-25 22:16
 **/
@Controller
@RequestMapping("/prop")
public class PropController {

    @Resource
    AuthorSetting authorSetting;

    @Resource
    AppSetting appSetting;

    @RequestMapping(value = "/getProp",produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String getProp(){
        return authorSetting.toString();
    }

    @RequestMapping(value = "/getProp2",produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String getProp2(){
        return appSetting.toString();
    }

}
