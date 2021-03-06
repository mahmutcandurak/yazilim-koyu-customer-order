package com.customer.project;

import com.customer.project.customer.Company;
import com.customer.project.customer.Customer;
import com.customer.project.customer.Individual;
import com.customer.project.order.OrderItem;
import com.customer.project.product.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test implements Taxable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Urunlerin isimlerinin, fiyatlarinin ve turune bagli diger ozelliklerinin product tipinde nesnelerde tutulmasi.
        Product product1 = new Hardware("monitor", 11, "LG UltraWide", 1500.00, 2);
        Product product2 = new Manuel("production", 12, "ManuelPro", 120.00,"admin");
        Product product3 = new Software("Win10", 13, "Windows 10 Pro KEY", 50.00,"A1S2-F1H2-K21U-21DA");
        Product product4 = new Hardware("24 inch tv", 14, "LG 24TL510S", 700.00, 2);
        Product product5 = new Software("steam random key",15,"steamKEY",10.00,"K12K-SF3G-SDFS-SD12");

        //Product nesnelerinde tanimlanan urunlerin stok miktarlari.
        OrderItem orderItem1 = new OrderItem(1,product1,2);
        OrderItem orderItem2 = new OrderItem(2,product2,4);
        OrderItem orderItem3 = new OrderItem(3,product3,12);
        OrderItem orderItem4 = new OrderItem(4,product4,5);
        OrderItem orderItem5 = new OrderItem(5,product5,27);


        List<Product> productList = new ArrayList<>(Arrays.asList(product1,product2,product3,product4,product5));       //Urunlerin tutuldugu liste
        List<String> selectedProductList = new ArrayList<>();                       //Secilen urunlerin tutuldugu liste
        List<Double> selectedPriceList = new ArrayList<>();                         //Secilen urunlerin fiyatlarinin tutuldugu liste

        //Sirket kullanicilarinin bilgilerinin nesne olarak tutulmasi.
        Customer company1 = new Company("Ataşehir","Renova","2161112233",1);
        Customer company2 = new Company("REMOTE","Yazılım Köyü","5151232343",2);

        //Bireysel kullancilarin bilgilerinin nesne olarak tutulmasi.
        Customer individual1 = new Individual("Beşiktaş","Selim Kiraz","123456578",1,"112233");
        Customer individual2 = new Individual("Üsküdar","Ceren Aygün","3256845218",2,"556677");

        System.out.println("WELCOME TO CUSTOMER - ORDER REGISTER SYSTEM ");
        System.out.println("----------------******----------------------");

        System.out.println("Please choose your user type: 1-Company 2- Individual");

        int userTypeChoise = scanner.nextInt();
        int userTypeChosen = 0;


        //Islemlerin sirket olarak mi yoksa bireysel olarak mi yapilacagini sorgulayan if bloklari.
        //Tercihe gore hangi sirket ya da hangi kullanici oldugu bilgisini de sorguluyoruz.
        if(userTypeChoise == 1) {
            System.out.println("Choose your company: 1- " + company1.getName() + " 2: " + company2.getName());
            userTypeChosen=scanner.nextInt();
            if (userTypeChosen == 1){
                System.out.println(company1.getName()+" chosen.");
            }
            else if (userTypeChosen == 2) {
                System.out.println(company2.getName()+" chosen.");
            }
        }
        if (userTypeChoise == 2) {
            System.out.println("Choose your customer: 1- " + individual1.getName() + " 2: " + individual2.getName());
            userTypeChosen=scanner.nextInt();
            if (userTypeChosen == 1){
                System.out.println(individual1.getName()+" chosen.");
            }
            else if (userTypeChosen == 2) {
                System.out.println(individual2.getName()+" chosen.");
            }
        }

        System.out.println("----------------******----------------------");


        System.out.println("Please choose your product:");

        //Urunleri tuttugumuz listeyi donduren foreach blogu
        for (Product x : productList) {
            System.out.println((productList.indexOf(x)+1) + " " +x.getName() + " Price: " + x.getRetailPrice());
        }

        int productChoice = scanner.nextInt();
        String productChosen = null;
        Double productPrice = null;

        //Kullanici 0 girene kadar tekrar eden, urun sectirmek icin kullanilan while loop.
        //Loop icinde switch case yapısı ile kullanicinin ürünleri secmesi saglanir. Sectigi urunler ilgili listlere atanir.
        while (productChoice != 0) {
            switch (productChoice) {
                case 1:
                    if (orderItem1.getQuantity()==0) {
                        System.out.println("We dont have any " + product1.getName());
                    }
                    else {
                        System.out.println("LG monitor was chosen.");
                        productChosen = product1.getName();
                        selectedProductList.add(productChosen);
                        productPrice = (product1.getRetailPrice())+((product1.getRetailPrice()) * orderItem1.getTax());
                        selectedPriceList.add(productPrice);
                        orderItem1.setQuantity(orderItem1.getQuantity()-1);
                    }
                    productChoice = scanner.nextInt();
                    break;
                case 2:
                    if (orderItem2.getQuantity()==0) {
                        System.out.println("We dont have any " + product2.getName());
                    }
                    else{
                        System.out.println("ManuelPro was chosen.");
                        selectedProductList.add(product2.getName());
                        productPrice = product2.getRetailPrice();
                        selectedPriceList.add(productPrice);
                        orderItem2.setQuantity(orderItem2.getQuantity()-1);
                    }
                    productChoice = scanner.nextInt();
                    break;
                case 3:
                    if (orderItem3.getQuantity()==0) {
                        System.out.println("We dont have any " + product3.getName());
                    }
                    else{
                        System.out.println("Windows10 was chosen.");
                        selectedProductList.add(product3.getName());
                        productPrice = product3.getRetailPrice();
                        selectedPriceList.add(productPrice);
                        orderItem3.setQuantity(orderItem3.getQuantity()-1);
                    }
                    productChoice = scanner.nextInt();
                    break;
                case 4:
                    if (orderItem4.getQuantity()==0) {
                        System.out.println("We dont have any " + product4.getName());
                    }
                    else {
                        System.out.println("LG TV was chosen");
                        selectedProductList.add(product4.getName());
                        productPrice = (product4.getRetailPrice())+((product4.getRetailPrice()) * orderItem4.getTax());
                        selectedPriceList.add(productPrice);
                        orderItem4.setQuantity(orderItem4.getQuantity()-1);
                    }
                    productChoice = scanner.nextInt();
                    break;
                case 5:
                    if (orderItem5.getQuantity()==0) {
                        System.out.println("We dont have any " + product5.getName());
                    }
                    else {
                        System.out.println("Steam Random key was chosen");
                        selectedProductList.add(product5.getName());
                        productPrice = product5.getRetailPrice();
                        selectedPriceList.add(productPrice);
                        orderItem5.setQuantity(orderItem5.getQuantity()-1);
                    }
                    productChoice = scanner.nextInt();
                    break;
                default:
                    System.out.println("Wrong choice. Please give correct number.");
                    productChoice = scanner.nextInt();
                    break;
            }
        }

        //Kullanicinin sectigi urunleri ekrana cikartan for loop.
        System.out.println("Selected products: ");
        for (String s : selectedProductList) {
            System.out.println(" - "+s + " ");
        }

        //Kullanicinin sectigi urunlerin toplam fiyatini toplayan for loop.
        double total = 0;
        for (Double z : selectedPriceList) {
            total = total + z;
        }

        //Toplam tutarı ekran basan komut.
        System.out.println("Total price: " + total +" $");

    }

    @Override
    public double getTax() {
        return 0.18;
    }
}

