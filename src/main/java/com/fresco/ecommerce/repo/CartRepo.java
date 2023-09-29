package com.fresco.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fresco.ecommerce.models.Cart;


public interface CartRepo extends JpaRepository<Cart, Integer> {

}
