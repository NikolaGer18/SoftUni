package io.github.nikolager18.softuni.java.basics.firststepsincoding.conditionaladvancedexercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        switch (operator) {
            case "+" -> {
                int sum = n1 + n2;
                String evenOrOddSum = (sum % 2 == 0) ? "even" : "odd";
                System.out.printf("%d %s %d = %d - %s%n", n1, operator, n2, sum, evenOrOddSum);
            }
            case "-" -> {
                int difference = n1 - n2;
                String evenOrOddDifference = (difference % 2 == 0) ? "even" : "odd";
                System.out.printf("%d %s %d = %d - %s%n", n1, operator, n2, difference, evenOrOddDifference);
            }
            case "*" -> {
                int multiple = n1 * n2;
                String evenOrOddMultiple = (multiple % 2 == 0) ? "even" : "odd";
                System.out.printf("%d %s %d = %d - %s%n", n1, operator, n2, multiple, evenOrOddMultiple);
            }
            case "/" -> {
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero%n", n1);
                } else {
                    double division = (double) n1 / n2;
                    System.out.printf("%d %s %d = %.2f%n", n1, operator, n2, division);
                }
            }
            case "%" -> {
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero%n", n1);
                } else {
                    int remainder = n1 % n2;
                    System.out.printf("%d %s %d = %d%n", n1, operator, n2, remainder);
                }
            }
        }


    }
}
