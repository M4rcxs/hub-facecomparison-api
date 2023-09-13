package com.br.hub.facecomparison.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.br.hub.facecomparison"})
public class SpringApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringApp.class, args);
    }
}