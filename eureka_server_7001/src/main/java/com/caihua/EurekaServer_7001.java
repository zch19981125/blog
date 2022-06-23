package com.caihua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * //todo
 *
 * <pre>
 * //todo
 * </pre>
 *
 * @author zch
 * @since $
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer_7001 {
	
	public static void main(String[] args) {
		
		SpringApplication.run(EurekaServer_7001.class,args);
	}
}
