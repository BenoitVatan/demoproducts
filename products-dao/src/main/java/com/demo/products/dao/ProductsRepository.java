package com.demo.products.dao;

import com.demo.products.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductsRepository {

    List<Product> findAllProducts();

    void addProduct(Product product);

    void removeProduct(int productId);

    Optional<Product> findProduct(int productId);


}
