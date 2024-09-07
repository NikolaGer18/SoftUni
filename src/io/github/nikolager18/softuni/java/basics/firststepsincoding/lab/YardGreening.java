package io.github.nikolager18.softuni.java.basics.firststepsincoding.lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double kvadrat = scan.nextDouble();
        double sum = kvadrat*7.61;
        double sum2 = sum * 0.18;
        System.out.printf("The final price is: %.2f lv. %n", sum - sum2);
        System.out.printf("The discount is: %.2f lv.", sum2);

    }
}
