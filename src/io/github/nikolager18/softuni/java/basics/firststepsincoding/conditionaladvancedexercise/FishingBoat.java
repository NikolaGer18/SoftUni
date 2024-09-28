package io.github.nikolager18.softuni.java.basics.firststepsincoding.conditionaladvancedexercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budgetGroup = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (season) {
            case "Spring" -> price = 3000;
            case "Summer", "Autumn" -> price = 4200;
            case "Winter" -> price = 2600;
        }
        if (fishermen <= 6) {
            price *= 0.9;
        } else if (fishermen >=7 && fishermen <= 11) {
            price *= 0.85;
        } else {
            price *= 0.75;
        }

        if (fishermen % 2 == 0 && !season.equals("Autumn")) {
            price *= 0.95;
        }

        if (budgetGroup >= price) {
            double left = budgetGroup - price;
            System.out.printf("Yes! You have %.02f leva left.", left);
        } else {
            double need = price - budgetGroup;
            System.out.printf("Not enough money! You need %.02f leva.", need);
        }

    }
}
