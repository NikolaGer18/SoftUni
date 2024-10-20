package io.github.nikolager18.softuni.java.basics.firststepsincoding.exam;

import java.util.Scanner;

public class FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dancers = Integer.parseInt(scanner.nextLine());
        double totalPoints = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();

        if (season.equals("summer")) {
            if (place.equals("Bulgaria")) {
                double sum = dancers * totalPoints;
                double after = sum - (sum * 0.05);
                double charityMoney = after * 0.75;
                double leftMoney = after - charityMoney;
                double moneyDancer = leftMoney / dancers;
                System.out.printf("Charity - %.2f%nMoney per dancer - %.2f", charityMoney, moneyDancer);

            } else if (place.equals("Abroad")) {
                double sum = dancers * totalPoints + ((dancers * totalPoints) * 0.5);
                double after = sum - (sum * 0.1);
                double charityMoney = after * 0.75;
                double leftMoney = after - charityMoney;
                double moneyDancer = leftMoney / dancers;
                System.out.printf("Charity - %.2f%nMoney per dancer - %.2f", charityMoney, moneyDancer);

            }
        } else if (season.equals("winter")) {
            if (place.equals("Bulgaria")) {
                double sum = dancers * totalPoints;
                double after = sum - (sum * 0.08);
                double charityMoney = after * 0.75;
                double leftMoney = after - charityMoney;
                double moneyDancer = leftMoney / dancers;
                System.out.printf("Charity - %.2f%nMoney per dancer - %.2f", charityMoney, moneyDancer);
            } else if (place.equals("Abroad")) {
                double sum = dancers * totalPoints + ((dancers * totalPoints) * 0.5);
                double after = sum - (sum * 0.15);
                double charityMoney = after * 0.75;
                double leftMoney = after - charityMoney;
                double moneyDancer = leftMoney / dancers;
                System.out.printf("Charity - %.2f%nMoney per dancer - %.2f", charityMoney, moneyDancer);

            }
        }
    }
}
