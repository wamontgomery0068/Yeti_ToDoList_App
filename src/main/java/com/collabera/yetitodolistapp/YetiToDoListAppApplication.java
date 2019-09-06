package com.collabera.yetitodolistapp;

//Imported Packages
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.testing.Hello;


@SpringBootApplication
@ComponentScan(value = {"com.collabera.yetitodolistapp", "com.testing"})
public class YetiToDoListAppApplication implements CommandLineRunner {
	
	@Autowired
	private Hello hello;
	
	public static void main(String[] args) {
		 ConfigurableApplicationContext context = SpringApplication.run(YetiToDoListAppApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("From Display Method");
		hello.display();
	}

}
