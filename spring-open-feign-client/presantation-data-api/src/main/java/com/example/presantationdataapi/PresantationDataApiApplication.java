package com.example.presantationdataapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class PresantationDataApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PresantationDataApiApplication.class, args);

    }

}
