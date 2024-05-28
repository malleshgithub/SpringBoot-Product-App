package com.productapp.curd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productapp.curd.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	Product findByName(String name);
}
