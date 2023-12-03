package com.demo.products.dao;

import com.demo.products.entity.Product;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;


public class MemoryProductsRepository implements ProductsRepository {

    private Map<Integer, Product> allProducts = new HashMap();

    MemoryProductsRepository() {
        URL productsUrl = Thread.currentThread().getContextClassLoader().getResource("products.json");
        allProducts = ProductLoader.loadProducts(productsUrl).stream()
                .collect(Collectors.toMap(product->product.getId(), Function.identity()));
    }

    @Override
    public List<Product> findAllProducts() {
        return allProducts.values().stream()
                .toList();
    }

    @Override
    public void addProduct(Product product) {
        allProducts.put(product.getId(), product);
    }

    @Override
    public void removeProduct(int productId) {
        allProducts.remove(productId);
    }

    @Override
    public Optional<Product> findProduct(int productId) {
        return Optional.ofNullable(allProducts.get(productId));
    }


}
