package com.beyzanur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@SpringBootApplication
@EnableFeignClients
public class AuthAplication {
    public static void main(String[] args) {
           SpringApplication.run(AuthAplication.class);
    }
}
