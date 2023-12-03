package com.demo.products.controller;


import com.demo.products.entity.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestController {

    @PostMapping("/products")
    public void createProduct(List<Product> products) {

    }

}
