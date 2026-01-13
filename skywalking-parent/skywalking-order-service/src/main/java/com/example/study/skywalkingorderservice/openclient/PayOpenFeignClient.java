package com.example.study.skywalkingorderservice.openclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author lucksoul
 * @version 1.0
 * @date 2026/1/13 20:32
 */

@FeignClient(name = "skywalking-pay-service")
public interface PayOpenFeignClient {

    @RequestMapping("/pay/orderPay")
    Boolean pay(@RequestParam String orderId, @RequestParam String userId,@RequestParam BigDecimal amt);
}
