package dev.portero.artisan.controller.product.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateProductRequest {

    private String name;
    private String description;
    private BigDecimal price;
    private int stockQuantity;
}
