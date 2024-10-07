package io.github.nikolager18.softuni.java.basics.firststepsincoding.conditionaladvancedexercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        String type1 = "Hotel";
        String type2 = "Camp";
        switch (season)
        {
            case "summer":
                if(budget <= 100)
                {
                    destination = "Somewhere in Bulgaria";
                    double interest = budget * 0.7;
                    System.out.printf("%s%n%s - %.02f",destination,type2, budget - interest);
                }
                else if (budget >= 100 && budget <= 1000 )
                {
                    destination = "Somewhere in Balkans";
                    double interest = budget * 0.6;
                    System.out.printf("%s%n%s - %.02f",destination,type2, budget - interest);
                }
                else
                {
                    destination = "Somewhere in Europe";
                    double interest = budget * 0.1;
                    System.out.printf("%s%n%s - %.02f",destination,type1, budget - interest);
                }
                break;

            case "winter":
                if(budget <= 100)
                {
                    destination = "Somewhere in Bulgaria";
                    double interest = budget * 0.3;
                    System.out.printf("%s%n%s - %.02f",destination,type1, budget - interest);
                }
                else if (budget >= 100 && budget <= 1000 )
                {
                    destination = "Somewhere in Balkans";
                    double interest = budget * 0.2;
                    System.out.printf("%s%n%s - %.02f",destination,type1, budget - interest);
                }
                else
                {
                    destination = "Somewhere in Europe";
                    double interest = budget * 0.1;
                    System.out.printf("%s%n%s - %.02f",destination,type1, budget - interest);
                }break;
            default:
                System.out.println("Please write either winter or summer to book!");
                break;
        }
    }
}
