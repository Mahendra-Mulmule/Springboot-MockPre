package com.mahi.mockprep;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= {"com.mahi.mockprep"})
@EnableJpaRepositories(basePackages="com.mahi.mockprep.Repository")
@EntityScan(basePackages ="com.mahi.mockprep.model")
public class MockprepApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockprepApplication.class, args);
	}

}
