package com.customer.project;

public class Software extends Product {
    private String licence;

    public Software(String licence) {
        this.licence = licence;
    }

    public String getLicence() {
        return licence;
    }
}
