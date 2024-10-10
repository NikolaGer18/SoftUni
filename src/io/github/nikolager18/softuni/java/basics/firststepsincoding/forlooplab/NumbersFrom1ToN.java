package io.github.nikolager18.softuni.java.basics.firststepsincoding.forlooplab;

import java.util.Scanner;

public class NumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i <= n; i += 3)
        {
            System.out.println(i);
        }
    }
}
