package com.trabalho.faculdade.products.application.usecasesimpl.product;

import com.trabalho.faculdade.products.core.entities.Product;
import com.trabalho.faculdade.products.core.usecases.product.RegisterProductUseCase;
import com.trabalho.faculdade.products.infrastructure.persistence.ProductRepository;
import com.trabalho.faculdade.products.web.dto.product.request.ProductRequestDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterProductUseCaseImpl implements RegisterProductUseCase {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    @Override
    public void execute(ProductRequestDto productRequestDto) {
        Product product = modelMapper.map(productRequestDto, Product.class);
        productRepository.save(product);
    }
}
