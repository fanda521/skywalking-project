package com.example.study.skywalkingorderservice.service;

import com.example.study.skywalkingorderservice.entity.OrderEntity;
import com.example.study.skywalkingorderservice.entity.ProductEntity;
import com.example.study.skywalkingorderservice.openclient.PayOpenFeignClient;
import com.example.study.skywalkingorderservice.openclient.StockOpenFeignClient;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author lucksoul
 * @version 1.0
 * @date 2026/1/13 20:25
 */
@Service
@Slf4j
public class OrderService {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private PayOpenFeignClient payOpenFeignClient;

    @Autowired
    private StockOpenFeignClient stockOpenFeignClient;

    public String addOrder(OrderEntity orderEntity) throws JsonProcessingException {
        // 1.创建定点
        log.info("创建订单成功:orderEntity={}", objectMapper.writeValueAsString(orderEntity));
        // 2.支付
        BigDecimal amt = BigDecimal.ZERO;
        List<ProductEntity> productList = orderEntity.getProductList();
        if (productList != null && productList.size() > 0) {
            for (ProductEntity productEntity : productList) {
                amt = amt.add(productEntity.getProductPrice().multiply(new BigDecimal(productEntity.getProductCount())));
            }
        }
        payOpenFeignClient.pay(orderEntity.getOrderId(), orderEntity.getUserId(),amt);
        // 3.扣除库存
        for (ProductEntity productEntity : orderEntity.getProductList()) {
            stockOpenFeignClient.deduct(productEntity.getProductId(), productEntity.getProductCount());
        }
        return "add order success:orderId" + orderEntity.getOrderId() + ",userId=" + orderEntity.getUserId();

    }
}
