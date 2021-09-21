package com.customer.project.order;

import com.customer.project.product.Hardware;
import com.customer.project.product.Product;
import com.customer.project.product.Taxable;

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
        return 0.18;
    }

    public double getUnitPrice() {
        return Double.parseDouble(String.valueOf(product.getRetailPrice()));
    }
}
