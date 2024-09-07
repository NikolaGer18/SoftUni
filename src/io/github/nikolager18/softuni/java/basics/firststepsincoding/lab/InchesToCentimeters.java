package io.github.nikolager18.softuni.java.basics.firststepsincoding.lab;

import java.util.Scanner;

public class InchesToCentimeters{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double b = scan.nextDouble();
        double a = b * 2.54;
        System.out.println(a);
    }
}
