package io.github.nikolager18.softuni.java.basics.firststepsincoding.exercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double annualPayment = Double.parseDouble(scan.nextLine());
        double priceSneakers = annualPayment-(annualPayment*0.4);
        double priceKit = priceSneakers - (priceSneakers*0.2);
        double priceBall = priceKit *0.25;
        double priceAccessories = priceBall * 0.20;
        double totalSum = annualPayment + priceAccessories+ priceKit + priceBall + priceSneakers;
        System.out.printf("%.2f", totalSum);
    }
}
