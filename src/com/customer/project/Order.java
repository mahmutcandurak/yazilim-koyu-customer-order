package com.customer.project;

import javax.swing.*;
import java.util.Date;

public class Order {

    private Customer customer;
    private static int id;
    private DefaultListModel item;
    private Date orderDate;
    private double orderTotal;


    public Order() {
    }

    public Order(Customer customer) {
        this.customer = customer;
    }

    public static void addOrderItem (int id) {

    }

    public Customer getCustomer() {
        return customer;
    }

    public static int getId() {
        return id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public DefaultListModel getModel() {
        return null;
    }
}
