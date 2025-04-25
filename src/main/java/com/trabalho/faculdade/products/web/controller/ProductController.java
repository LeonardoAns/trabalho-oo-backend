package com.trabalho.faculdade.products.web.controller;

import com.trabalho.faculdade.products.core.usecases.product.*;
import com.trabalho.faculdade.products.web.dto.product.request.ProductRequestDto;
import com.trabalho.faculdade.products.web.dto.product.response.ProductResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final RegisterProductUseCase registerProductUseCase;
    private final GetAllProductsUseCase getAllProductsUseCase;
    private final GetProductByCodeUseCase getProductByCodeUseCase;
    private final ChangeProductUseCase changeProductUseCase;
    private final DeleteProductUseCase deleteProductUseCase;

    @PostMapping("/register")
    public ResponseEntity<Void> registerProduct(@RequestBody ProductRequestDto productRequestDto) {
        this.registerProductUseCase.execute(productRequestDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get")
    public ResponseEntity<List<ProductResponseDto>> getAllProducts() {
        List<ProductResponseDto> products = this.getAllProductsUseCase.execute();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/get/{code}")
    public ResponseEntity<ProductResponseDto> getProductByCode(@PathVariable("code") Long code) {
        ProductResponseDto product = this.getProductByCodeUseCase.execute(code);
        return ResponseEntity.ok(product);
    }

    @DeleteMapping("/delete/{code}")
    public ResponseEntity<Void> deleteProduct(@PathVariable("code") Long code) {
        this.deleteProductUseCase.execute(code);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/change/{code}")
    public ResponseEntity<Void> changeProduct(@RequestBody ProductRequestDto productRequestDto, @PathVariable("code") Long code) {
        this.changeProductUseCase.execute(productRequestDto, code);
        return ResponseEntity.ok().build();
    }
}
