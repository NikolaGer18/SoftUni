package io.github.nikolager18.softuni.java.basics.firststepsincoding.lab;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String family = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String town = scan.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.",name,family,age,town);
    }
}
