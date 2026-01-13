package com.example.study.skywalkingorderservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author lucksoul
 * @version 1.0
 * @date 2026/1/13 20:28
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {

    private String productId;

    private String productName;

    private String productDesc;

    private BigDecimal productPrice;

    private Integer productCount;


}
