package com.caihua.config;

import org.checkerframework.checker.units.qual.C;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HttpRequestConfig {
	
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}
