package com.demo.products.dao;

import com.demo.products.entity.Product;

import java.util.List;

public interface ProductsRepository {

    public List<Product> findAllProducts();

    public void createProduct(Product product);

}
