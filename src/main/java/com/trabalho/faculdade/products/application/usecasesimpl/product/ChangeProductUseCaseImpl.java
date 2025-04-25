package com.trabalho.faculdade.products.application.usecasesimpl.product;

import com.trabalho.faculdade.products.core.entities.Product;
import com.trabalho.faculdade.products.core.usecases.product.ChangeProductUseCase;
import com.trabalho.faculdade.products.infrastructure.persistence.ProductRepository;
import com.trabalho.faculdade.products.web.dto.product.request.ProductRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChangeProductUseCaseImpl implements ChangeProductUseCase {

    private final ProductRepository productRepository;

    @Override
    public void execute(ProductRequestDto productRequestDto, Long code) {
        Product product = this.productRepository.findByCode(code)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        product.setName(productRequestDto.getName());
        product.setDescription(productRequestDto.getDescription());
        product.setPrice(productRequestDto.getPrice());
        product.setQuantity(productRequestDto.getQuantity());
        System.out.println("Product updated: " + product.toString());
        productRepository.save(product);
    }
}
