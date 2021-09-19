package com.customer.project;

public class Company extends Customer {

    private String contact;
    private int discount;

    public Company(String address, String name, String phone, int id, String contact, int discount) {
        super(address, name, phone, id);
        this.contact = contact;
        this.discount = discount;
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
