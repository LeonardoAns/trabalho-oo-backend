package com.trabalho.faculdade.products.application.usecasesimpl.product;

import com.trabalho.faculdade.products.core.entities.Product;
import com.trabalho.faculdade.products.core.usecases.product.DeleteProductUseCase;
import com.trabalho.faculdade.products.infrastructure.persistence.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteProductUseCaseImpl implements DeleteProductUseCase {

    private final ProductRepository productRepository;

    @Override
    public void execute(Long code) {
        Product product = this.productRepository.findById(code)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        this.productRepository.delete(product);
    }
}
