package com.customer.project.customer;

public class Company extends Customer {

    private String contact;
    private int discount;

    public Company() {
    }

    public Company(String address, String name, String phone, int id) {
        super(address, name, phone, id);
    }

    public Company(String contact, int discount) {
        this.contact = contact;
        this.discount = discount;
    }

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
