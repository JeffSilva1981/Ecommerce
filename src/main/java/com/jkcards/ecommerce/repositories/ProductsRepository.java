package com.jkcards.ecommerce.repositories;

import com.jkcards.ecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Long> {
}
