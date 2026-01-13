package com.example.study.skywalkingorderservice.openclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lucksoul
 * @version 1.0
 * @date 2026/1/13 20:35
 */

@FeignClient(name = "skywalking-stock-service")
public interface StockOpenFeignClient {

    @RequestMapping("/stock/deduct")
    Boolean deduct(@RequestParam String productId, @RequestParam Integer count);
}
