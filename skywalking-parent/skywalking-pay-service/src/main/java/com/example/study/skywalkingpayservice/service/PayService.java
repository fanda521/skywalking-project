package com.example.study.skywalkingpayservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author lucksoul
 * @version 1.0
 * @date 2026/1/13 20:52
 */
@Service
@Slf4j
public class PayService {
    public Boolean orderPay(String orderId, String userId, BigDecimal amt) {
        log.info("开始处理订单支付,orderId={},userId={},amt:{}",orderId,userId,amt);
        log.info("处理订单支付-succe,orderId={},userId={},amt:{}",orderId,userId,amt);

        return Boolean.TRUE;
    }
}
