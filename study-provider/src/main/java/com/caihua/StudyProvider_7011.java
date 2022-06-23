package com.caihua;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.caihua.mapper")
public class StudyProvider_7011 {
	
	public static void main(String[] args) {
		
		SpringApplication.run(StudyProvider_7011.class,args);
	}
}
