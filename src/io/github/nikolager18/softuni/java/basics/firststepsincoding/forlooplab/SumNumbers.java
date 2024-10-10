package io.github.nikolager18.softuni.java.basics.firststepsincoding.forlooplab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountNumbers = Integer.parseInt(scanner.nextLine());
        int numbers = 0;

        for(int i = 0; i< amountNumbers; i++)
        {
            numbers += scanner.nextInt();
        }
        System.out.println(numbers);
    }
}
