package io.github.nikolager18.softuni.java.basics.firststepsincoding.conditionaladvancedexercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double priceRoses = 5;
        double priceDahlias = 3.8;
        double priceTulips = 2.8;
        double priceNarcissus = 3;
        double priceGladiolus = 2.5;
        double totalPrice = 0;
        switch (flowers)
        {
            case "Roses":
                totalPrice = quantity * priceRoses;
                if (quantity > 80) {
                    totalPrice -= totalPrice * 0.1;
                }
                break;
            case "Dahlias":
                totalPrice = quantity * priceDahlias;
                    if (quantity > 90) {
                        totalPrice -= totalPrice * 0.15;
                    }
                    break;
            case "Tulips":
                totalPrice = quantity * priceTulips;
                    if (quantity > 80) {
                        totalPrice -= totalPrice * 0.15;
                    }break;
            case "Narcissus":
                totalPrice= quantity * priceNarcissus;
                    if (quantity < 120) {
                    totalPrice += totalPrice * 0.15;
                }break;
            case "Gladiolus":
                totalPrice= quantity * priceGladiolus;
                if (quantity < 80) {
                    totalPrice += totalPrice * 0.2;
                }break;
        }

        if(budget >= totalPrice)
        {
            double moneyLeft = budget - totalPrice;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.%n", quantity, flowers, moneyLeft);
        }else
        {
            double moneyNeeded =  totalPrice - budget;
            System.out.printf("Not enough money, you need %.2f leva more.%n",moneyNeeded);
        }


    }
}
