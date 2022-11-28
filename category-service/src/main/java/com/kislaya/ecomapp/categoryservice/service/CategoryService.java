package com.kislaya.ecomapp.categoryservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kislaya.ecomapp.categoryservice.model.Category;
import com.kislaya.ecomapp.categoryservice.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository categoryRepo;
	
	public List<Category> listCategory() {
        return categoryRepo.findAll();
    }

}
