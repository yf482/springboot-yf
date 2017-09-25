package com.yf.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* @Desc
* @author yunfeng
* @create 2017/9/24 12:49
* @version V.1.0
**/
@SpringBootApplication
//@ImportResource({"classpath:some-context.xml","classpath:some-context2.xml"})
public class SpringbootApplication {

	private final static Logger logger = LoggerFactory.getLogger(SpringbootApplication.class);

	public static void main(String[] args) {
//		SpringApplication.run(SpringbootApplication.class, args);
		//关闭springboot启动banner
		SpringApplication application = new SpringApplication(SpringbootApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}
}
