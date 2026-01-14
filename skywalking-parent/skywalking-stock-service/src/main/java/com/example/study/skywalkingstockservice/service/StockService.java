package com.example.study.skywalkingstockservice.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.skywalking.apm.toolkit.trace.Tag;
import org.apache.skywalking.apm.toolkit.trace.Tags;
import org.apache.skywalking.apm.toolkit.trace.Trace;
import org.springframework.stereotype.Service;

/**
 * @author lucksoul
 * @version 1.0
 * @date 2026/1/13 20:48
 */
@Service
@Slf4j
public class StockService {


    @Trace // 标记该方法被 SkyWalking 追踪，必须添加
    @Tags({
            // 采集第一个入参 orderId（下标 0）
            @Tag(key = "productId", value = "arg[0]"),
            @Tag(key = "count", value = "arg[1]"),
            @Tag(key = "deductStockResult", value = "returnedObj")
    })
    public Boolean deductStock(String productId, Integer count) {
        log.info("开始扣减库存,productId:{},count:{}", productId, count);
        log.info("扣减库存成功,productId:{},count:{}", productId, count);
        return true;
    }
}
