package io.github.nikolager18.softuni.java.basics.firststepsincoding.conditionalexercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double puzzle = 2.6;
        double talkingDoll = 3;
        double teddyBear = 4.1;
        double minion = 8.2;
        double truck = 2;
        double priceVacation = Double.parseDouble(scanner.nextLine());
        double amountPuzzles= Double.parseDouble(scanner.nextLine());
        double amountTalkingDolls =Double.parseDouble(scanner.nextLine());
        double amountTeddyBears= Double.parseDouble(scanner.nextLine());
        double amountMinions = Double.parseDouble(scanner.nextLine());
        double amountTrucks = Double.parseDouble(scanner.nextLine());
        double totalSumOfToys = (amountPuzzles * puzzle) + (amountTalkingDolls * talkingDoll)+ (amountTeddyBears * teddyBear) + (amountMinions * minion) + (amountTrucks * truck);
        System.out.println(totalSumOfToys);
        double totalAmountOfToys = amountMinions + amountPuzzles + amountTrucks + amountTeddyBears + amountTalkingDolls;
        System.out.println(totalAmountOfToys);
        double priceReductionAfter50 = totalSumOfToys*0.25;
        System.out.println(priceReductionAfter50);
        double endPrice = totalSumOfToys - priceReductionAfter50;
        System.out.println(endPrice);
        double rent = endPrice * 0.10;
        System.out.println(rent);
        double winnings = endPrice - rent;
        System.out.println(winnings);
        double winnings2= winnings - priceVacation;
        double money = priceVacation - winnings;
        if (winnings > priceVacation)
        {
            System.out.printf("Yes! %.02f lv left.",winnings2);
        }
        else if (winnings < priceVacation)
        {
            System.out.printf("Not enough money! %.02f lv needed.",money);
        }
    }
}
