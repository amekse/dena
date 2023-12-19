package com.firstpitch.firstpitch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstpitchApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstpitchApplication.class, args);
	}
	
	@RequestMapping("/")
	String helloWorld() {
		return "Hello World";
	}

}
