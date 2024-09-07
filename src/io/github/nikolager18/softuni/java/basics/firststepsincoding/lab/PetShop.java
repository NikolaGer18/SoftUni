package io.github.nikolager18.softuni.java.basics.firststepsincoding.lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dogs = Integer.parseInt(scan.nextLine());
        int cats = Integer.parseInt(scan.nextLine());
        double sum = dogs * 2.50 + cats * 4;
        System.out.printf("%.2f lv.", sum);
    }
}
