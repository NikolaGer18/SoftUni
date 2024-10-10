package io.github.nikolager18.softuni.java.basics.firststepsincoding.forlooplab;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int value = 0;

        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'a' -> value += 1;
                case 'e' -> value += 2;
                case 'i' -> value += 3;
                case 'o' -> value += 4;
                case 'u' -> value += 5;
            }
        }

        System.out.println(value);
    }
}
