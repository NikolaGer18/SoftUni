package io.github.nikolager18.softuni.java.basics.firststepsincoding.exam;

import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maidenPartyPrice = Double.parseDouble(scanner.nextLine());
        int loveLetters = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int keyChain = Integer.parseInt(scanner.nextLine());
        int caricatures = Integer.parseInt(scanner.nextLine());
        int fortunes = Integer.parseInt(scanner.nextLine());

        double loveLetter = 0.6;
        double rose = 7.2;
        double singleKeyChain = 3.6;
        double caricature = 18.2;
        double fortune = 22;

        double totalSum = loveLetter * loveLetters + roses * rose + singleKeyChain * keyChain + caricature * caricatures + fortune * fortunes;
        double amountAttributes = loveLetters + roses + keyChain + caricatures + fortunes;
        if (amountAttributes >= 25) {
            double discount = totalSum * 0.35;
            double sumAfter = totalSum - discount;
            double hosting = sumAfter * 0.1;
            double winnings = sumAfter - hosting;

            if (winnings > maidenPartyPrice) {
                System.out.printf("Yes! %.2f lv left.", winnings - maidenPartyPrice);
            } else if (winnings < maidenPartyPrice) {
                System.out.printf("Not enough money! %.2f lv needed.", maidenPartyPrice - winnings);
            }
        } else {
            double hosting = totalSum * 0.1;
            double winnings = totalSum - hosting;
            if (winnings > maidenPartyPrice) {
                System.out.printf("Yes! %.2f lv left.", winnings - maidenPartyPrice);
            } else if (winnings < maidenPartyPrice) {
                System.out.printf("Not enough money! %.2f lv needed.", maidenPartyPrice - winnings);
            }
        }

    }
}
