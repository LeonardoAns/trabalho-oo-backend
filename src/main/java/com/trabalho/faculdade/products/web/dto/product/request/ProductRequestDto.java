package com.trabalho.faculdade.products.web.dto.product.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequestDto {

    private String name;
    private String description;
    private Double price;
    private Integer quantity;
    private Long code;
}
