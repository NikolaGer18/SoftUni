package io.github.nikolager18.softuni.java.basics.firststepsincoding.conditionalexercise;

import java.util.Scanner;

public class TimeOver15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        minutes +=15;
        if(minutes>=60){
            hours+=1;
            minutes -= 60;
        }
        if(hours == 24){
            hours = 0;
        }
        System.out.printf("%d:%02d%n", hours, minutes);
    }
}
