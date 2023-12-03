package com.demo.products.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class InfrastructureFactory {


    @Bean
    public ProductsRepository productsRepository() {
        return new MemoryProductsRepository();
    }
}
