package com.example.vuedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan(basePackages = {"com"})
@MapperScan("com.example.vuedemo.dao")
public class VuedemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VuedemoApplication.class, args);
    }

}
