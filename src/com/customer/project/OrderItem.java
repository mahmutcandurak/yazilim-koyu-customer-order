package com.customer.project;

public class OrderItem {

    private int lineNbr;
    private Product product;
    private int quantity;

    private Taxable taxable = new Hardware();

    public OrderItem() {

    }
    public OrderItem(int lineNbr, Product product, int quantity) {
        this.lineNbr = lineNbr;
        this.product = product;
        this.quantity = quantity;
    }

    public int getLineNbr() {
        return lineNbr;
    }

    public void setLineNbr(int lineNbr) {
        this.lineNbr = lineNbr;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getItemTotal() {
        return 0;
    }

    public double getTax () {
        return this.taxable.getTax();
    }

    public double getUnitPrice() {
        return Double.parseDouble(String.valueOf(product.getRetailPrice()));
    }
}
