package com.onlinebookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.onlinebookstore")
@EntityScan("com.onlinebookstore.dao")
public class OnlinebookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlinebookstoreApplication.class, args);
	}

}
