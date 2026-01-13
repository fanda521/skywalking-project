package com.example.study.skywalkingorderservice.controller;

import com.example.study.skywalkingorderservice.entity.OrderEntity;
import com.example.study.skywalkingorderservice.service.OrderService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lucksoul
 * @version 1.0
 * @date 2026/1/13 20:25
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/add")
    public String addOrder(@RequestBody OrderEntity orderEntity) throws JsonProcessingException {
        return orderService.addOrder(orderEntity);
    }
}
