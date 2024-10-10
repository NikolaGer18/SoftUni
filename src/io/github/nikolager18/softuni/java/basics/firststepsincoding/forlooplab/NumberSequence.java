package io.github.nikolager18.softuni.java.basics.firststepsincoding.forlooplab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < numbers; i++)
        {
            int result = scanner.nextInt();
            max = Math.max(result, max);
            min = Math.min(result, min);
        }
        System.out.printf("Max number: %d%n", max);
        System.out.printf("Min number: %d%n", min);
    }
}
