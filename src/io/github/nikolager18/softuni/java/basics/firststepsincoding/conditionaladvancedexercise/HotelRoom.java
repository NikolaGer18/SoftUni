package io.github.nikolager18.softuni.java.basics.firststepsincoding.conditionaladvancedexercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        switch (month)
        {
            case "May", "October":
                double priceStudio = 50;
                double priceApartment = 65;
                if(nights > 7 && nights < 14)
                {
                    double discount = priceStudio * 0.95;
                    double sumSt = discount * nights;
                    double sumAp = priceApartment * nights;
                    System.out.printf("Apartment: %.02f lv.\n", sumAp);
                    System.out.printf("Studio: %.02f lv.", sumSt);
                }else if(nights > 14)
                {
                    double discountSt = priceStudio * 0.7;
                    double discountAp = priceApartment * 0.9;
                    double sumSt = discountSt * nights;
                    double sumAp = discountAp * nights;
                    System.out.printf("Apartment: %.02f lv.\n", sumAp);
                    System.out.printf("Studio: %.02f lv.", sumSt);
                }else
                {
                    double sumAp = priceApartment * nights;
                    double sumSt = priceStudio * nights;
                    System.out.printf("Apartment: %.02f lv.\n", sumAp);
                    System.out.printf("Studio: %.02f lv.", sumSt);
                }break;

            case "June", "September":
                double priceStudio2 = 75.20;
                double priceApartment2 = 68.70;
                if(nights > 14)
                {
                    double discountSt = priceStudio2 * 0.8;
                    double discountAp = priceApartment2 * 0.9;
                    double sumSt = discountSt * nights;
                    double sumAp = discountAp * nights;
                    System.out.printf("Apartment: %.02f lv.\n", sumAp);
                    System.out.printf("Studio: %.02f lv.", sumSt);
                }else
                {
                    double sumAp = priceApartment2 * nights;
                    double sumSt = priceStudio2 * nights;
                    System.out.printf("Apartment: %.02f lv.\n", sumAp);
                    System.out.printf("Studio: %.02f lv.", sumSt);
                }break;
            case "July", "August":
                double priceStudio3 = 76;
                double priceApartment3 = 77;
                if(nights > 14)
                {
                    double discountAp = priceApartment3 * 0.9;
                    double sumSt = priceStudio3 * nights;
                    double sumAp = discountAp * nights;
                    System.out.printf("Apartment: %.02f lv.\n", sumAp);
                    System.out.printf("Studio: %.02f lv.", sumSt);
                }
                else
                {
                    double sumSt = priceStudio3 * nights;
                    double sumAp = priceApartment3 * nights;
                    System.out.printf("Apartment: %.02f lv.\n", sumAp);
                    System.out.printf("Studio: %.02f lv.", sumSt);
                }break;

        }
    }
}
