package com.demo.products.business;

import com.demo.products.dao.ProductsRepository;
import com.demo.products.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductService {

    @Autowired
    private ProductsRepository productsRepository;

    public List<Product> allProducts() {
        return productsRepository.findAllProducts();
    }

    public Optional<Product> findProductById(int productId) {
        return productsRepository.findProduct(productId);
    }

    public void addProducts(List<Product> products) {
        for(Product product : products) {
            productsRepository.addProduct(product);
        }
    }
}
