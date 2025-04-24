package com.trabalho.faculdade.products.web.controller;

import com.trabalho.faculdade.products.core.usecases.product.RegisterProductUseCase;
import com.trabalho.faculdade.products.web.dto.product.request.ProductRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final RegisterProductUseCase registerProductUseCase;

    @PostMapping("/register")
    public ResponseEntity<Void> registerProduct(@RequestBody ProductRequestDto productRequestDto) {
        registerProductUseCase.execute(productRequestDto);
        return ResponseEntity.ok().build();
    }
}
