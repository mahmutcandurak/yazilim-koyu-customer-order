package com.customer.project;

public class Customer {

    private String address,name,phone;
    private int id;

    public Customer() {

    }

    public Customer(int id) {
        this.id = id;
    }


    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getId() {
        return id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }
}