package io.github.nikolager18.softuni.java.basics.firststepsincoding.exercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long sum = Long.parseLong(scan.nextLine());
        int deadline = Integer.parseInt(scan.nextLine());
        double interest = Double.parseDouble(scan.nextLine())/100;
        double totalSum = sum + deadline *((sum * interest)/12);

        System.out.printf("%.2f", totalSum);
    }
}
