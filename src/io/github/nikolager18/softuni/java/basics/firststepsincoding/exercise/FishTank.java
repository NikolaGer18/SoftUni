package io.github.nikolager18.softuni.java.basics.firststepsincoding.exercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double lenghtCm = Double.parseDouble(scan.nextLine());
        double widthCm = Double.parseDouble(scan.nextLine());
        double heightCm = Double.parseDouble(scan.nextLine());
        double percent = (Double.parseDouble(scan.nextLine()))/100;
        double aquariumSize = (lenghtCm * widthCm * heightCm);
        double litreSize = aquariumSize*0.001;
        double litresNeeded = litreSize * ( 1 - percent);
        System.out.printf("%.3f",litresNeeded);
    }
}
