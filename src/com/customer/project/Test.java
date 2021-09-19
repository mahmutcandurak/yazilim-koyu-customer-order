package com.customer.project;

import java.util.Scanner;

public class Test {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Customer customer = new Customer();
        Individual individual = new Individual();
        Company company = new Company("istanbul","Ahmet","5061234569",1,"contact",1);
        Order order = new Order();
        //OrderItem orderItem = new OrderItem();
        Product product = new Product();
        //Hardware hardware = new Hardware();
        Manuel manuel = new Manuel();
        //Software software = new Software();




        System.out.println("Please give customer info's:");
        String address;
        address = scanner.nextLine();
        customer.setAddress(address);
        System.out.println(customer.getAddress());


    }



}


/*
        public void message() {
        System.out.println("Please give customer info's:");
        String address;
        address = scanner.nextLine();
        customer.setAddress(address);
        System.out.println(customer.getAddress());
    }

 */