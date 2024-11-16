package com.example.ProductTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProductTask.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
