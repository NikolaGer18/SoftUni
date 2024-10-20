package io.github.nikolager18.softuni.java.basics.firststepsincoding.conditionalexercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double puzzle = 2.6;
        int talkingDoll = 3;
        double teddyBear = 4.1;
        double minion = 8.2;
        int truck = 2;
        double priceVacation = Double.parseDouble(scanner.nextLine());
        int amountPuzzles= Integer.parseInt(scanner.nextLine());
        int amountTalkingDolls =Integer.parseInt(scanner.nextLine());
        int amountTeddyBears= Integer.parseInt(scanner.nextLine());
        int amountMinions = Integer.parseInt(scanner.nextLine());
        int amountTrucks = Integer.parseInt(scanner.nextLine());
        double totalSumOfToys = (amountPuzzles * puzzle) + (amountTalkingDolls * talkingDoll)+ (amountTeddyBears * teddyBear) + (amountMinions * minion) + (amountTrucks * truck);
        double totalAmountOfToys = amountMinions + amountPuzzles + amountTrucks + amountTeddyBears + amountTalkingDolls;

        if(totalAmountOfToys >= 50){
            double priceReductionAfter50 = totalSumOfToys*0.25;
            double endPrice = totalSumOfToys - priceReductionAfter50;
            double rent = endPrice * 0.10;
            double winnings = endPrice - rent;
            double winnings2= winnings - priceVacation;
            double money = priceVacation - winnings;
            if(winnings >= priceVacation) {
                System.out.printf("Yes! %.02f lv left.", winnings2);
            }else {
                System.out.printf("Not enough money! %.02f lv needed.",money);
            }
        }
        else {
            double rent = totalSumOfToys * 0.10;
            double winnings = totalSumOfToys - rent;
            double money = priceVacation - winnings;
            if(winnings > priceVacation) {
                System.out.printf("Yes! %.02f lv left.", winnings);
            }else {
                System.out.printf("Not enough money! %.02f lv needed.",money);
            }
        }
    }
}
