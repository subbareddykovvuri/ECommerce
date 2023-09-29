package com.fresco.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fresco.ecommerce.models.CartProduct;

public interface CartProductRepo extends JpaRepository<CartProduct, Integer> {

}
