package io.github.nikolager18.softuni.java.basics.firststepsincoding.conditionaladvanced;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
       if(number >= 100 && number <= 200)
       {
           System.out.println("");
       }
       else if (number == 0){
           System.out.println("");
       }else{
           System.out.println("invalid");
       }
    }
}
