package com.trabalho.faculdade.products.core.usecases.product;

import com.trabalho.faculdade.products.web.dto.product.response.ProductResponseDto;

public interface GetProductByCodeUseCase {
    ProductResponseDto execute(Long code);
}
