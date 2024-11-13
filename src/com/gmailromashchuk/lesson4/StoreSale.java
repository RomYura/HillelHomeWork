package com.gmailromashchuk.lesson4;

public class StoreSale {
    public static void main(String[] args) {


        int number = 1;
        double totalPrice = 12153.41;
        int days = 5;

        summary(totalPrice, days, number);


        number++;
        totalPrice = 10486.85;
        days = 7;

        summary(totalPrice, days, number);


    }

    private static void summary(double totalPrice, int number, int days) {
        double AveragePrice = Math.round(totalPrice / days * 100) / 100.0;
        System.out.printf("Product No: %d smartphone, \n", number);
        System.out.printf("Total sales for this product is EUR %.2f. \n", totalPrice);
        System.out.printf("Sales per day is EUR %.2f.\n", AveragePrice);
    }


}




