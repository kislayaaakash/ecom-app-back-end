package com.kislaya.ecomapp.categoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kislaya.ecomapp.categoryservice.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
