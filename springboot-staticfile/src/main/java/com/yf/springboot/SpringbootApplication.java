package com.yf.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	private final static Logger logger = LoggerFactory.getLogger(SpringbootApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
