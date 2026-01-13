package com.example.study.skywalkingstockservice.controller;

import com.example.study.skywalkingstockservice.service.StockService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lucksoul
 * @version 1.0
 * @date 2026/1/13 20:45
 */
@RestController
@Slf4j
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private StockService stockService;

    @RequestMapping("/deduct")
    public Boolean deductStock(String productId, Integer count) {
        Boolean aBoolean = stockService.deductStock(productId, count);
        log.info("扣减库存结果：productId:{}.coount:{},{}",productId,count, aBoolean);
        return aBoolean;
    }
}
