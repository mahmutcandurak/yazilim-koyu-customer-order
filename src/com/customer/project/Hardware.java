package com.customer.project;

public class Hardware extends Product implements Taxable{

    private int warrantyPeriod;

    public Hardware() {
    }

    public Hardware(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }


    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public double getTax() {
        return 0;
    }


}

