package com.example.ProductTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProductTask.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
