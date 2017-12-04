package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringBootSampleApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSampleApplication.class, args);
	}
}