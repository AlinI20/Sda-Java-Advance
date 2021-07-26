package com.sda.shopapp.model;

import java.time.Instant;
import java.util.Date;

public class GroceryProduct extends FoodProduct {
    private String Id;
    private Double price;
    private String currency;
    private String name;
    private String description;

    public GroceryProduct(Date expirationDate,
                          boolean isBio,
                          String countryOfOrigin,
                          String id,
                          Double price,
                          String currency,
                          String name,
                          String description
    ) {
        super(expirationDate, isBio, countryOfOrigin);

        Id = id;
        if (price != null && price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Invalid price");
        }
        this.currency = currency;
        this.name = name;
        this.description = description;
    }


    @Override
    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public void add(GroceryProduct groceryProduct) {
    }
}