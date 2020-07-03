package com.webo.app.twowheelerloan.masterservice.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@EnableEurekaClient
@SpringBootApplication
@ComponentScan("com.webo.app.twowheelerloan.masterservice")
public class TwoWheelerLoanApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwoWheelerLoanApplication.class, args);
	}

}
