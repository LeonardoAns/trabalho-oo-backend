package com.trabalho.faculdade.products.application.usecasesimpl.product;

import com.trabalho.faculdade.products.core.entities.Product;
import com.trabalho.faculdade.products.core.usecases.product.GetAllProductsUseCase;
import com.trabalho.faculdade.products.infrastructure.persistence.ProductRepository;
import com.trabalho.faculdade.products.web.dto.product.response.ProductResponseDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAllProductsUseCaseImpl implements GetAllProductsUseCase {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<ProductResponseDto> execute() {
        List<Product> products = this.productRepository.findAll();
        return products.stream()
                .map(product -> this.modelMapper.map(product,ProductResponseDto.class))
                .toList();
    }
}
