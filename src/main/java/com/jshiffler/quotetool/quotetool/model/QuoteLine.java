package com.jshiffler.quotetool.quotetool.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class QuoteLine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    Long quoteId;
    String product_name;
    String product_manufacturer;
    float unit_price;
    int quantity;
    float discount;

    public QuoteLine(Long quoteId, String product_name, String product_manufacturer, float unit_price,
                     int quantity, float discount) {
        this.quoteId = quoteId;
        this.product_name = product_name;
        this.product_manufacturer = product_manufacturer;
        this.unit_price = unit_price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(Long quoteId) {
        this.quoteId = quoteId;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_manufacturer() {
        return product_manufacturer;
    }

    public void setProduct_manufacturer(String product_manufacturer) {
        this.product_manufacturer = product_manufacturer;
    }

    public float getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(float unit_price) {
        this.unit_price = unit_price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
}
