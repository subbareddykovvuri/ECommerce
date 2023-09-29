package com.fresco.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fresco.ecommerce.models.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
