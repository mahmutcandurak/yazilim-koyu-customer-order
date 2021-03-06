package com.customer.project.customer;

import com.customer.project.customer.Customer;

public class Individual extends Customer {

    private String licNumber;

    public Individual() {
    }

    public Individual(String address, String name, String phone, int id, String licNumber) {
        super(address, name, phone, id);
        this.licNumber = licNumber;
    }

    public Individual(String licNumber) {
        this.licNumber = licNumber;
    }

    public String getLicNumber() {
        return licNumber;
    }

    public void setLicNumber(String licNumber) {
        this.licNumber = licNumber;
    }

    @Override
    public String toString() {
        return "Individual{" +
                "licNumber='" + licNumber + '\'' +
                '}';
    }
}
