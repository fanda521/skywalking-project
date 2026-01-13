package com.example.study.skywalkingorderservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author lucksoul
 * @version 1.0
 * @date 2026/1/13 20:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {

    private String orderId;

    private String userId;

    private List<ProductEntity> productList;
}
