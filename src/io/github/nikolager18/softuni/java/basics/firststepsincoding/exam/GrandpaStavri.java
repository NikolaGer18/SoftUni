package io.github.nikolager18.softuni.java.basics.firststepsincoding.exam;

import java.util.Scanner;

public class GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double rakiaAmount = 0;
        double degrees = 0;
        double total = 0;
        double average = 0;
        double allRakia = 0;
        for (int i = 0; i < n; i++) {
            rakiaAmount = Double.parseDouble(scanner.nextLine());
            degrees = Double.parseDouble(scanner.nextLine());
            double sum = rakiaAmount * degrees;
            allRakia += rakiaAmount;
            total += sum;
            average = total / allRakia;
        }
        if (average < 38) {
            System.out.printf("Liter: %.2f%nDegrees: %.2f%nNot good, you should baking!", allRakia, average);
        } else if (average > 42) {
            System.out.printf("Liter: %.2f%nDegrees: %.2f%nDilution with distilled water!", allRakia, average);
        } else if (average >= 38 && average < 42) {
            System.out.printf("Liter: %.2f%nDegrees: %.2f%nSuper!", allRakia, average);
        }
    }
}
