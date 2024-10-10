package io.github.nikolager18.softuni.java.basics.firststepsincoding.conditionaladvancedexercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysOfStay = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String grade = scanner.nextLine();
        double price = 0;
        double sum = 0;
        switch (typeOfRoom) {
            case "room for one person":
                price = 18;
                sum = price * (daysOfStay - 1);
                if (grade.equals("positive")) {
                    double add = sum + (sum * 0.25);
                    System.out.printf("%.02f", add);
                } else if (grade.equals("negative")) {
                    double minus = sum - (sum * 0.10);
                    System.out.printf("%.02f", minus);
                }
                break;
            case "apartment":
                price = 25;
                sum = price * (daysOfStay - 1);
                if (daysOfStay < 10) {
                    double finalPrice = sum * 0.70;
                    if (grade.equals("positive")) {
                        double add = finalPrice + (finalPrice * 0.25);
                        System.out.printf("%.02f", add);
                    } else if (grade.equals("negative")) {
                        double minus = finalPrice - (finalPrice * 0.10);
                        System.out.printf("%.02f", minus);
                    }
                } else if (daysOfStay > 10 && daysOfStay < 15) {
                    double finalPrice = sum * 0.65;
                    if (grade.equals("positive")) {
                        double add = finalPrice + (finalPrice * 0.25);
                        System.out.printf("%.02f", add);
                    } else if (grade.equals("negative")) {
                        double minus = finalPrice - (finalPrice * 0.10);
                        System.out.printf("%.02f", minus);
                    }
                } else if (daysOfStay > 15) {
                    double finalPrice = sum * 0.50;
                    if (grade.equals("positive")) {
                        double add = finalPrice + (finalPrice * 0.25);
                        System.out.printf("%.02f", add);
                    } else if (grade.equals("negative")) {
                        double minus = finalPrice - (finalPrice * 0.10);
                        System.out.printf("%.02f", minus);
                    }
                }
                break;
            case "president apartment":
                price = 35;
                sum = price * (daysOfStay - 1);
                if (daysOfStay < 10)
                {
                    double finalPrice = sum * 0.90;
                    if (grade.equals("positive")) {
                        double add = finalPrice + (finalPrice * 0.25);
                        System.out.printf("%.02f", add);
                    } else if (grade.equals("negative")) {
                        double minus = finalPrice - (finalPrice * 0.10);
                        System.out.printf("%.02f", minus);
                    }
                }else if (daysOfStay > 10 && daysOfStay < 15) {
                    double finalPrice = sum * 0.85;
                    if (grade.equals("positive")) {
                        double add = finalPrice + (finalPrice * 0.25);
                        System.out.printf("%.02f", add);
                    } else if (grade.equals("negative")) {
                        double minus = finalPrice - (finalPrice * 0.10);
                        System.out.printf("%.02f", minus);
                    }
                } else if (daysOfStay > 15) {
                    double finalPrice = sum * 0.80;
                    if (grade.equals("positive")) {
                        double add = finalPrice + (finalPrice * 0.25);
                        System.out.printf("%.02f", add);
                    } else if (grade.equals("negative")) {
                        double minus = finalPrice - (finalPrice * 0.10);
                        System.out.printf("%.02f", minus);
                    }
                }
                break;
            default:
                System.out.println("Select a real room.");
                break;

        }
    }
}
