package com.gmailromashchuk;

public class Store {
    public static void main(String[] args) {
        String name;
        String product;
        float price;
        String address;

        name = "Alice.";
        product = "Smartphone";
        price = 349.99f;
        address = "Moon Street, 10.";

        System.out.println("Order No 1 Client: " + name);
        System.out.println("Product: " + product);
        System.out.println("Price EUR " + price + ".");
        System.out.println("Address: " + address);
        System.out.println("===================================");

        String name1;
        String product1;
        float price1;
        String address1;

        name1 = "Tom.";
        product1 = "laptop";
        price1 = 570.95f;
        address1 = "Terra Street, 17.";


        System.out.println("Order No 2 Client: " + name1);
        System.out.println("Product: " + product1);
        System.out.println("Price EUR " + price1 + ".");
        System.out.println("Address: " + address1);

    }
}
