package com.example.study.skywalkingstockservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SkywalkingStockServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkywalkingStockServiceApplication.class, args);
    }

}
