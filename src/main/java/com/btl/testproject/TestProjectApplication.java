package com.btl.testproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.btl.controller" , "com.btl.service"})
public class TestProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
	}

}
