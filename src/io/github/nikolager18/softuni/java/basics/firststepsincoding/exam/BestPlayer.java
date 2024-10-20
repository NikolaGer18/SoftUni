package io.github.nikolager18.softuni.java.basics.firststepsincoding.exam;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bestPlayer = "";
        int bestGoals = 0;

        while (true) {
            String playerName = scanner.nextLine();
            if (playerName.equals("END")) {
                break;
            }
            int goals = Integer.parseInt(scanner.nextLine());

            if (goals > bestGoals) {
                bestGoals = goals;
                bestPlayer = playerName;
            }

            if (goals >= 10) {
                System.out.printf("%s is the best player!%n", bestPlayer);
                System.out.printf("He has scored %d goals and made a hat-trick !!!%n", bestGoals);
                return;
            }
        }

        System.out.printf("%s is the best player!%n", bestPlayer);
        if (bestGoals >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!%n", bestGoals);
        } else {
            System.out.printf("He has scored %d goals.%n", bestGoals);
        }
    }
}

