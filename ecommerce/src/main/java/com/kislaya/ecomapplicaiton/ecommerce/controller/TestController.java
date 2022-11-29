package com.kislaya.ecomapplicaiton.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1")
public class TestController {
	
	@GetMapping(path = "/test-controller")
	public String testCatController() {
		return "Test Successful";
	}
	
}
