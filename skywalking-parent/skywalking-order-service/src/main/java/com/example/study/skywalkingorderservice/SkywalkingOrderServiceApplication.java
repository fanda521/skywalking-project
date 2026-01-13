package com.example.study.skywalkingorderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient // 服务注册发现
@EnableFeignClients // 启用OpenFeign服务调用（可选）
public class SkywalkingOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkywalkingOrderServiceApplication.class, args);
    }

}
