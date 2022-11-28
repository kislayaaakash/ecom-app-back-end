package com.kislaya.ecomapp.categoryservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kislaya.ecomapp.categoryservice.model.Category;
import com.kislaya.ecomapp.categoryservice.service.CategoryService;

@RestController
@RequestMapping(path ="/api/v1")
public class CategoryController {
	
	@Autowired
	CategoryService catService;
	
	@GetMapping(path = "test-cat-controller")
	public String testCatController() {
		return "cat controller online";
	}
	
	@GetMapping(path ="/list/categories")
	public List<Category> listCategories() {
        return catService.listCategory();
    }
	
	

}
