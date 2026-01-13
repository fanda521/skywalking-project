package com.example.study.skywalkingstockservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author lucksoul
 * @version 1.0
 * @date 2026/1/13 20:48
 */
@Service
@Slf4j
public class StockService {

    public Boolean deductStock(String productId, Integer count) {
        log.info("开始扣减库存,productId:{},count:{}", productId, count);
        log.info("扣减库存成功,productId:{},count:{}", productId, count);
        return true;
    }
}
