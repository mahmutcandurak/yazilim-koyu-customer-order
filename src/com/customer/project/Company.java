package com.customer.project;

public class Company extends Customer {

    private String contact;
    private int discount;

    public Company(int id, String contact) {
        super(id);
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getDiscount() {
        return discount;
    }
}
