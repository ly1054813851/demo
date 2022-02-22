package com.example.java8test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
//@ServletComponentScan(basePackages = "com.example.java8test")
public class Java8testApplication {

    public static void main(String[] args) {
        SpringApplication.run(Java8testApplication.class, args);
    }

}
