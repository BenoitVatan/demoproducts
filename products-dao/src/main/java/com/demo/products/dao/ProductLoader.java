package com.demo.products.dao;

import com.demo.products.entity.Product;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductLoader {

    public static List<Product> loadProducts(URL url) {
        String json = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))) {
            json = br.lines().
                    collect(Collectors.joining("\n"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        ObjectMapper mapper = new ObjectMapper();

        List<Product> out = null;
        try {
            out = mapper.readValue(json, new TypeReference<List<Product>>() {
            });
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
        return out;
    }

    public static void main(String[] args) {
        URL url = ProductLoader.class.getClassLoader().getResource("products.json");
        List<Product> products = new ProductLoader().loadProducts(url);
        System.out.println(products);
    }
}
