package com.customer.project;

public class OrderItem {

    private int lineNbr;
    private Product product;
    private int quantity;

    public OrderItem(int lineNbr) {
        this.lineNbr = lineNbr;
    }

    public int getLineNbr() {
        return lineNbr;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getItemTotal() {
        return 0;
    }

    public double getTax () {
        return 0;
    }

    public double getUnitPrice() {
        return 0;
    }
}
