package com.sam.rest.myrestapi3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.sam.rest.myrestapi3.daos")
@EntityScan("com.sam.rest.myrestapi3.beans")
@SpringBootApplication
public class Myrestapi3Application {

	public static void main(String[] args) {
		SpringApplication.run(Myrestapi3Application.class, args);
	}
}
