package io.github.nikolager18.softuni.java.basics.firststepsincoding.exampreparation;

import java.util.Scanner;

public class FamilyHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double nightPrice = Double.parseDouble(scanner.nextLine());
        int percentExpenses = Integer.parseInt(scanner.nextLine());
        if(nights > 7)
        {
            double discount = nightPrice - (nightPrice * 0.05);
            double sum = budget - ((budget * percentExpenses/100) + (nights * discount));
            if(sum < budget)
            {
                System.out.printf("Ivanovi will be left with %.02f leva after vacation", sum);
            }
            else if(sum > budget)
            {
                System.out.printf("%.02f leva needed.", sum);
            }
        }
        else
        {
            double sum = budget - ((budget * percentExpenses/100) + (nights * nightPrice));
            if(sum < budget)
            {
                System.out.printf("Ivanovi will be left with %.02f leva after vacation", sum);
            }
            else if(sum > budget)
            {
                System.out.printf("%.02f leva needed.", sum);
            }
        }
    }
}
