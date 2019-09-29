package com.example.springbootexception;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.stereotype.Controller;


@Controller
@SpringBootApplication
public class SpringBootExceptionApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootExceptionApplication.class, args);
	}
}