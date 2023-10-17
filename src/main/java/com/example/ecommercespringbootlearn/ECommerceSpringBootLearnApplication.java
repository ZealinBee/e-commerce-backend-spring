package com.example.ecommercespringbootlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()

public class ECommerceSpringBootLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceSpringBootLearnApplication.class, args);
	}

}

