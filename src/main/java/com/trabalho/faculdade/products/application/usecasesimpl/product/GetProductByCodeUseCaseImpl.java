package com.trabalho.faculdade.products.application.usecasesimpl.product;

import com.trabalho.faculdade.products.core.entities.Product;
import com.trabalho.faculdade.products.core.usecases.product.GetProductByCodeUseCase;
import com.trabalho.faculdade.products.infrastructure.persistence.ProductRepository;
import com.trabalho.faculdade.products.web.dto.product.response.ProductResponseDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetProductByCodeUseCaseImpl implements GetProductByCodeUseCase {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    @Override
    public ProductResponseDto execute(Long code) {
        Product product = this.productRepository.findByCode(code)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        return this.modelMapper.map(product, ProductResponseDto.class);
    }
}
