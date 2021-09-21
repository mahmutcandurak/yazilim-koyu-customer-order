package com.customer.project.product;

public class Manuel extends Product {

    private String publisher;

    public Manuel() {
    }

    public Manuel(String publisher) {
        this.publisher = publisher;
    }

    public Manuel(String description, int id, String name, Double retailPrice, String publisher) {
        super(description, id, name, retailPrice);
        this.publisher = publisher;
        setName(name);
        setRetailPrice(retailPrice);
        setDescription(description);
        setId(id);
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
