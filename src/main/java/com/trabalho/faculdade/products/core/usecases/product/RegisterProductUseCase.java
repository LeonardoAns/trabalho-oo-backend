package com.trabalho.faculdade.products.core.usecases.product;

import com.trabalho.faculdade.products.web.dto.product.request.ProductRequestDto;

public interface RegisterProductUseCase {
    void execute(ProductRequestDto productRequestDto);
}
