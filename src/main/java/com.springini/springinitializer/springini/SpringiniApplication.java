package com.springinitializer.springini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController

public class SpringiniApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringiniApplication.class, args);
	}
	
	
	@RequestMapping(value = "/")
	public String hello(){
		return "Hello Sup!";
	}

}
