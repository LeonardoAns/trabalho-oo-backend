package com.trabalho.faculdade.products.infrastructure.persistence;

import com.trabalho.faculdade.products.core.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
