package com.example.study.skywalkinggateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // 服务注册发现（可选，启用Nacos时需要）
public class SkywalkingGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkywalkingGatewayApplication.class, args);
    }

}
