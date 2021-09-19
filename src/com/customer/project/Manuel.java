package com.customer.project;

public class Manuel extends Product {

    private String publisher;

    public Manuel() {
    }

    public Manuel(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
