package com.kislaya.ecomapp.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kislaya.ecomapp.productservice.configuration.Configuration;

@RestController
@RequestMapping("api/v1/")
public class ProductController {
    
    @Autowired
    private Configuration configuration;

   @GetMapping(path ="/hello-world")
    public String helloWorld() {
        return configuration.getHello() + configuration.getWorld();
    }
    
}