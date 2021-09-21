package com.customer.project.product;

public class Software extends Product {
    private String licence;

    public Software() {
    }

    public Software(String description, int id, String name, Double retailPrice, String licence) {
        super(description, id, name, retailPrice);
        this.licence = licence;
        setName(name);
        setRetailPrice(retailPrice);
        setDescription(description);
        setId(id);
    }

    public Software(String licence) {
        this.licence = licence;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }
}
