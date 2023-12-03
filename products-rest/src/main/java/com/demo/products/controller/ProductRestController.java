package com.demo.products.controller;


import com.demo.products.business.ProductService;
import com.demo.products.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestController {

    @Autowired
    private ProductService productService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE, path="/products")
    public void createProduct(List<Product> products) {
        productService.addProducts(products);
    }

    @GetMapping("/products")
    public List<Product> products() {
        return productService.allProducts();
    }

    @GetMapping("/products/{productId}")
    public Product product(@PathVariable("productId") int productId) {
        return productService.findProductById(productId).orElseThrow(
                ()->new ProductNotFoundException()
        );
    }

}
