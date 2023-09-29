package com.fresco.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fresco.ecommerce.models.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
