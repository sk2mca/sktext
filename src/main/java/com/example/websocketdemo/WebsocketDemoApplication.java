package com.example.websocketdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class WebsocketDemoApplication  {

	public static void main(String[] args) {
        System.out.println("Application started in Spring boot master");
	    SpringApplication.run(WebsocketDemoApplication.class, args);
	}
}
