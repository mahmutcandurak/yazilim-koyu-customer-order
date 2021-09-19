package com.customer.project;

public class Hardware extends Product implements Taxable{

    private int warrantyPeriod;

    public Hardware() {
    }

    public Hardware(String description, int id, String name, Double retailPrice, int warrantyPeriod) {
        super(description, id, name, retailPrice);
        this.warrantyPeriod = warrantyPeriod;
        setName(name);
        setRetailPrice(retailPrice);
        setDescription(description);
        setId(id);
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

