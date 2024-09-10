package io.github.nikolager18.softuni.java.basics.firststepsincoding.conditionalexercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double movieBudget = Double.parseDouble(scanner.nextLine());
        int extra = Integer.parseInt(scanner.nextLine());
        double priceKitExtra = Double.parseDouble(scanner.nextLine());
        double decorationSum = movieBudget * 0.10;
        double kitSum = extra * priceKitExtra;
        double totalSum2 = decorationSum + kitSum;
       if(extra > 150 && totalSum2>movieBudget)
       {
           double discount = kitSum * 0.10;
           double totalSum1 = kitSum - discount;
           double totalSum3 = decorationSum + totalSum1;
           System.out.printf("Not enough money!%nWingard needs %.02f leva more.", totalSum3 - movieBudget);

       }else if(extra > 150 && movieBudget > totalSum2){
           double discount = kitSum * 0.10;
           double totalSum1 = kitSum - discount;
           double totalSum3 = decorationSum + totalSum1;
           System.out.printf("Action!%nWingard starts filming with %.02f leva left.", movieBudget - totalSum3);
       }
       else if (extra <= 150 && movieBudget >= totalSum2)
       {
           System.out.printf("Action!%nWingard starts filming with %.02f leva left.", movieBudget - totalSum2);
       }
       else if (extra <= 150 && movieBudget <= totalSum2)
       {
           System.out.printf("Not enough money!%nWingard needs %.02f leva more.", totalSum2 - movieBudget);
       }
    }
}
