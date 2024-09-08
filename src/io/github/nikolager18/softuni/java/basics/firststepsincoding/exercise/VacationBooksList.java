package io.github.nikolager18.softuni.java.basics.firststepsincoding.exercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amountPages = Integer.parseInt(scan.nextLine());
        int pages = Integer.parseInt(scan.nextLine());
        int amountDays = Integer.parseInt(scan.nextLine());
        int totalHours = (amountPages / pages)/amountDays;
        System.out.printf("%d",totalHours);
    }
}
