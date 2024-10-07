package io.github.nikolager18.softuni.java.basics.firststepsincoding.exampreparation;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double quantityBananas = Double.parseDouble(scanner.nextLine());
        double quantityOranges = Double.parseDouble(scanner.nextLine());
        double quantityRaspberry = Double.parseDouble(scanner.nextLine());
        double quantityStrawberry = Double.parseDouble(scanner.nextLine());

        double priceRaspberry = strawberryPrice * 0.5;
        double priceOranges = priceRaspberry * 0.6;
        double priceBananas = priceRaspberry * 0.2;


        double wholeSum = priceBananas * quantityBananas + priceOranges * quantityOranges + priceRaspberry * quantityRaspberry + strawberryPrice * quantityStrawberry;
        System.out.printf("%.02f", wholeSum);

    }
}
