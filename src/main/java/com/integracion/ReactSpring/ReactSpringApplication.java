package com.integracion.ReactSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class})
public class ReactSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactSpringApplication.class, args);
	}

}
