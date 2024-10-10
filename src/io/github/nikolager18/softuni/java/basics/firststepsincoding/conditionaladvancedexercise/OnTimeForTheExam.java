package io.github.nikolager18.softuni.java.basics.firststepsincoding.conditionaladvancedexercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minutesExam = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());

        int examTimeInMinutes = hourExam * 60 + minutesExam;
        int arrivalTimeInMinutes = arrivalHour * 60 + arrivalMinute;
        int difference = arrivalTimeInMinutes - examTimeInMinutes;

        if (difference > 0) {
            System.out.println("Late");
        } else if (difference >= -30) {
            System.out.println("On time");
        } else {
            System.out.println("Early");
        }

        if (difference != 0) {
            int absDifference = Math.abs(difference);
            if (absDifference < 60) {
                System.out.printf("%d minutes %s the start%n", absDifference, difference > 0 ? "after" : "before");
            } else {
                int hours = absDifference / 60;
                int minutes = absDifference % 60;
                System.out.printf("%d:%02d hours %s the start%n", hours, minutes, difference > 0 ? "after" : "before");
            }
        }
    }
}
