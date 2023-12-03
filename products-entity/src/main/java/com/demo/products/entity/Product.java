package com.demo.products.entity;

import java.math.BigDecimal;

public class Product {
    private int id;
    private String code;
    private String name;

    private String description;
    private BigDecimal price;
    private int quantity;
    private String inventoryStatus;
    private String category;
    private String image;
    private BigDecimal rating;

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getInventoryStatus() {
        return inventoryStatus;
    }

    public String getCategory() {
        return category;
    }

    public String getImage() {
        return image;
    }

    public BigDecimal getRating() {
        return rating;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setInventoryStatus(String inventoryStatus) {
        this.inventoryStatus = inventoryStatus;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }
}
