package io.github.nikolager18.softuni.java.basics.firststepsincoding.conditionaladvanced;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();
        switch (dayOfWeek)
        {
            case "Monday":
                if(hour >= 10 && hour <= 18) {
                    System.out.println("open");
                }else{
                    System.out.println("closed");
                }break;
            case "Tuesday":
                if(hour >= 10 && hour <= 18) {
                    System.out.println("open");
                }else{
                    System.out.println("closed");
                }break;
            case "Wednesday":
                if(hour >= 10 && hour <= 18) {
                    System.out.println("open");
                }else{
                    System.out.println("closed");
                }break;
            case "Thursday":
                if(hour >= 10 && hour <= 18) {
                    System.out.println("open");
                }else{
                    System.out.println("closed");
                }break;
            case "Friday":
                if(hour >= 10 && hour <= 18) {
                    System.out.println("open");
                }else{
                    System.out.println("closed");
                }break;
            case "Saturday":
                if(hour >= 10 && hour <= 18) {
                    System.out.println("open");
                }else{
                    System.out.println("closed");
                }break;
            case "Sunday":
                if(hour >= 0 && hour <= 24) {
                    System.out.println("closed");
                }break;
        }
        }
    }

