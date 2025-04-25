package com.trabalho.faculdade.products.core.usecases.product;

import com.trabalho.faculdade.products.web.dto.product.response.ProductResponseDto;

import java.util.List;

public interface GetAllProductsUseCase {
    List<ProductResponseDto> execute();
}
