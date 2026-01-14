package com.example.study.skywalkingpayservice.controller;

import com.example.study.skywalkingpayservice.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author lucksoul
 * @version 1.0
 * @date 2026/1/13 20:50
 */
@RestController
@RequestMapping("/pay")
@Slf4j
public class PayController {

    @Autowired
    private PayService payService;

    @RequestMapping("/orderPay")
    public Boolean pay(String orderId, String userId, BigDecimal amt) throws InterruptedException {
        Boolean aBoolean = payService.orderPay(orderId, userId, amt);
        log.info("支付结果：orderId:{},userId:{},amt:{},{}",orderId,userId,amt, aBoolean);
        return aBoolean;
    }
}
