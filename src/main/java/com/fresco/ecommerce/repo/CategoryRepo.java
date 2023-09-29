package com.fresco.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fresco.ecommerce.models.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
