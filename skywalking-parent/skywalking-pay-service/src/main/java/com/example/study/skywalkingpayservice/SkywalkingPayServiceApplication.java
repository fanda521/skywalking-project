package com.example.study.skywalkingpayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SkywalkingPayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkywalkingPayServiceApplication.class, args);
    }

}
