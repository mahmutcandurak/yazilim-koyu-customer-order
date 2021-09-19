package com.customer.project;

public class Individual extends Customer {

    private String licNumber;

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
