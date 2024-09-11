package io.github.nikolager18.softuni.java.basics.firststepsincoding.conditionalexercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordSeconds = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double timeSwimmingFor1Meter = Double.parseDouble(scanner.nextLine());
        double seconds = distanceMeters * timeSwimmingFor1Meter;
        double delay = Math.floor(distanceMeters / 15) * 12.5;
        double fullTime = seconds + delay;
        if(recordSeconds > fullTime)
        {
            System.out.printf("Yes, he succeeded! The new world record is %.02f seconds.",fullTime);
        }
        else if(recordSeconds <= fullTime)
        {
            System.out.printf("No, he failed! He was %.02f seconds slower.",fullTime - recordSeconds);
        }
    }
}
