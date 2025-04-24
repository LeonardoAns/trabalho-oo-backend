package com.trabalho.faculdade.products.core.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Integer quantity;
    private Long code;

    public Product(String name, String description, Double price, Integer quantity, Long code) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.code = code;
    }
}
