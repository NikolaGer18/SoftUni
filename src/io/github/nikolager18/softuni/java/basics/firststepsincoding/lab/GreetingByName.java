package io.github.nikolager18.softuni.java.basics.firststepsincoding.lab;

import java.util.Scanner;
public class GreetingByName{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
