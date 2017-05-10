package com.github.vangogh_ken;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan //添加此注解之后，spring才会自动扫描子包下的class
@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
@RestController
public class EurekaApplicationClient {
	
	@Value("${server.port}")
	String port;

	@RequestMapping("/echo")
	public String echo(@RequestParam String name) {
		return port + ", Hello World, " + name;
	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaApplicationClient.class, args);
	}

}