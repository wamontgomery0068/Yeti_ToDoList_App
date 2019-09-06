package com.collabera.yetitodolistapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(value = {"com.collabera.yetitodolistapp"})
public class YetiToDoListAppApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		 ConfigurableApplicationContext context = SpringApplication.run(YetiToDoListAppApplication.class, args);
	}

}
