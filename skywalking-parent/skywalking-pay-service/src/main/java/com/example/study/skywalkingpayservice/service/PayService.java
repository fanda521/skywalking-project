package com.example.study.skywalkingpayservice.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.skywalking.apm.toolkit.trace.Tag;
import org.apache.skywalking.apm.toolkit.trace.Tags;
import org.apache.skywalking.apm.toolkit.trace.Trace;
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

    @Trace // 标记该方法被 SkyWalking 追踪，必须添加
    @Tags({
            // 采集第一个入参 orderId（下标 0）
            @Tag(key = "orderId", value = "arg[0]"),
            // 采集第二个入参 userId（下标 1）
            @Tag(key = "userId", value = "arg[1]"),
            // 采集第三个入参 amt（下标 2），BigDecimal 类型会自动转为字符串展示
            @Tag(key = "amt", value = "arg[2]"),
            // 采集方法返回结果（Boolean 类型）
            @Tag(key = "payResult", value = "returnedObj")
    })
    public Boolean orderPay(String orderId, String userId, BigDecimal amt) {
        log.info("开始处理订单支付,orderId={},userId={},amt:{}",orderId,userId,amt);
        log.info("处理订单支付-succe,orderId={},userId={},amt:{}",orderId,userId,amt);

        return Boolean.TRUE;
    }
}
