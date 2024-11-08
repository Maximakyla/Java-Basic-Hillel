package com.gmail.maximakyla.homework_4_1;

public class PriceCalculation {
    public static void main(String[] args) {

//      Product No.1
        String product = "smartphone";
        String currency = "EUR";
        byte productNumber = 1;
        double price = 999.99;
        int unitSold = 66;
        int salePeriod = 5;
        double totalSale = unitSold * price;
        double averageSale = totalSale / salePeriod;

        System.out.println("Product No." + productNumber + ": " + product);
        System.out.println("Total sales for " + salePeriod + " days is " + currency + " " + totalSale);
        System.out.printf("Sales by day %s is %.2f", currency, averageSale);

//      Product No.2
        product = "laptop";
        currency = "USD";
        productNumber = 2;
        price = 1458.32;
        unitSold = 12;
        salePeriod = 7;
        totalSale = unitSold * price;
        averageSale = totalSale / salePeriod;

        System.out.println("\n\nProduct No." + productNumber + ": " + product);
        System.out.println("Total sales for " + salePeriod + " days is " + currency + " " + totalSale);
        System.out.printf("Sales by day is %s %.2f" , currency, averageSale);
    }
}
