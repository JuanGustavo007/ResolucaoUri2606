package com.example.uri2606.dto;


import com.example.uri2606.entities.Products;

public class ProductsDto {

    private Long id;
    private String name;
    private Double amount;
    private Double price;
    private Long categoryId;

    public ProductsDto(Long id, String name, Double amount, Double price, Long categoryId) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.categoryId = categoryId;
    }

    public ProductsDto(Products products) {
        this.id = products.getId();
        this.name = products.getName();
        this.amount = products.getAmount();
        this.price = products.getPrice();
        categoryId = products.getCategory().getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
