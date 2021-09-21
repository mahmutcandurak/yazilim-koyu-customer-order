package com.customer.project.order;

import com.customer.project.customer.Customer;

import java.util.ArrayList;
import java.util.Date;

public class Order {

    private Customer customer;
    private int id;
    private ArrayList<OrderItem> orderItems = new ArrayList<>();
    private Date orderDate;
    private double orderTotal;


    public Order() {
    }

    public Order(Customer customer, int id, ArrayList<OrderItem> orderItems, Date orderDate, double orderTotal) {
        this.customer = customer;
        this.id = id;
        this.orderItems = orderItems;
        this.orderDate = orderDate;
        this.orderTotal = orderTotal;
    }


    public static void addOrderItem (int id) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }
}
