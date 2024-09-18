package io.github.nikolager18.softuni.java.basics.firststepsincoding.conditionaladvancedlab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double price = 0;

        switch(town)
        {
            case "Sofia":
                if (product.equals("coffee")) {
                    price = 0.5;
                } else if (product.equals("water")) {
                    price = 0.8;
                } else if (product.equals("beer")) {
                    price = 1.2;
                } else if (product.equals("sweets")) {
                    price = 1.45;
                } else if (product.equals("peanuts")) {
                    price = 1.6;
                }
                break;
            case "Plovdiv":
                if (product.equals("coffee")) {
                    price = 0.4;
                } else if (product.equals("water")) {
                    price = 0.7;
                } else if (product.equals("beer")) {
                    price = 1.15;
                } else if (product.equals("sweets")) {
                    price = 1.3;
                } else if (product.equals("peanuts")) {
                    price = 1.5;
                }
                break;
            case "Varna":
                if (product.equals("coffee")) {
                    price = 0.45;
                } else if (product.equals("water")) {
                    price = 0.7;
                } else if (product.equals("beer")) {
                    price = 1.1;
                } else if (product.equals("sweets")) {
                    price = 1.35;
                } else if (product.equals("peanuts")) {
                    price = 1.55;
                }
                break;
            default:
                System.out.println("Invalid town.");
                return;
        }

        double totalCost = price * amount;

        System.out.println(totalCost);
        }
    }

