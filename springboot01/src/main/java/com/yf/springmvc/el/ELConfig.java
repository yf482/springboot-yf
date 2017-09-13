package com.yf.springmvc.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * @author yunfeng
 * @version V.1.0
 * @title
 * @Desc
 * @create 2017-09-13 23:04
 **/
@Configuration
//@ComponentScan("com.yf.springmvc.el")
@PropertySource("classpath:com/yf/springmvc/el/test.properties")
public class ELConfig {

    //注入普通字符串
    @Value("I like it")
    private  String normal;
    //注入操作系统属性
    @Value("#{systemProperties['os.name']}")
    private String osName;
    //注入表达式结果
    @Value("#{T(java.lang.Math).random()*100.0}")
    private double randomNumber;
    //注入其他Bean属性
    @Value("#{demoService.another}")
    private String fromAnother;
    //注入文件资源
    @Value("classpath:com/yf/springmvc/el/test.txt")
    private Resource testFile;
    //注入网址资源
    @Value("http://www.baidu.com")
    private Resource testUrl;
    //注入配置文件
    @Value("${book.name}")
    private Resource bookName;

    @Autowired
    private Environment environment;


    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outPutResource()  {
        try {
            System.out.println("testUrl = " + IOUtils.toString(testUrl.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("environment = " + environment.getProperty("book.author"));
    }

    @Override
    public String toString() {
        return "ELConfig{" +
                "normal='" + normal + '\'' +
                ", osName='" + osName + '\'' +
                ", randomNumber=" + randomNumber +
                ", fromAnother=" + fromAnother +
                ", randomNumber=" + randomNumber +
                ", testUrl=" + testUrl +
                ", bookName=" + bookName +
                ", environment=" + environment +
                '}';
    }
}
