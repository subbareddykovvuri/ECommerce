package com.fresco.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fresco.ecommerce.models.Role;

public interface RoleRepo extends JpaRepository<Role, Integer> {

}
