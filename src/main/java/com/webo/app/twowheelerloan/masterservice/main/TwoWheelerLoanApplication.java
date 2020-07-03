package com.webo.app.twowheelerloan.masterservice.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableEurekaClient
@SpringBootApplication
@EnableJpaRepositories
public class TwoWheelerLoanApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwoWheelerLoanApplication.class, args);
	}

}
