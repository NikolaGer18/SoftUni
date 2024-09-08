package io.github.nikolager18.softuni.java.basics.firststepsincoding.exercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double chickenMenu = 10.35;
        double fishMenu = 12.40;
        double veggieMenu = 8.15;

        int amountChickenMenus = Integer.parseInt(scan.nextLine());
        int amountFishMenus = Integer.parseInt(scan.nextLine());
        int amountVeggieMenus = Integer.parseInt(scan.nextLine());
        double sumChicken = amountChickenMenus * chickenMenu;
        double sumFish = amountFishMenus * fishMenu;
        double sumVeggie = amountVeggieMenus * veggieMenu;
        double totalSum = sumChicken + sumVeggie + sumFish;
        double dessertPrice = totalSum * 0.20;
        double delivery = 2.50;
        double totalSumOfAll = totalSum + dessertPrice + delivery;
        System.out.printf("%.2f",totalSumOfAll);
    }
}
