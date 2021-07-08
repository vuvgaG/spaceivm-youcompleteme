package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.Logger;

@SpringBootApplication
public class DemoApplication {

  private Logger logger;

	public static void main(String[] args) {
    System.out.println("Hello");
	}

}
