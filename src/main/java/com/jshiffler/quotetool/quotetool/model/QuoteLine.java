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
    String partNumber;
    String productDescription;
    String productManufacturer;
    float unitPrice;
    int quantity;
    float discount;


    QuoteLine(Long quoteId, String partNumber, String productDescription, String productManufacturer, float unitPrice,
              int quantity, float discount) {

        this.setQuoteId(quoteId);
        this.setPartNumber(partNumber);
        this.setProductDescription(productDescription);
        this.setProductManufacturer(productManufacturer);
        this.setUnitPrice(unitPrice);
        this.setQuantity(quantity);
        this.setDiscount(discount);

    }

    public QuoteLine() {
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

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
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
