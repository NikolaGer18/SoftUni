package io.github.nikolager18.softuni.java.basics.firststepsincoding.exercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double nylon = 1.50;
        double paint = 14.50;
        double paintThinner = 5.00;

        int amountNylon = Integer.parseInt(scan.nextLine());
        int amountPaint = Integer.parseInt(scan.nextLine());
        int amountThinner = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());
        double sumNylon = (amountNylon + 2) * nylon;
        double sumPaint = (amountPaint + (amountPaint*0.10))* paint;
        double thinner = amountThinner * paintThinner;
        double sumBags = 0.40;
        double totalSum = sumNylon + sumPaint + thinner + sumBags;
        double totalSumWorkers = (totalSum * 0.30)*hours;
        double total = totalSumWorkers + totalSum;
        System.out.printf("%.2f", total);

    }
}
