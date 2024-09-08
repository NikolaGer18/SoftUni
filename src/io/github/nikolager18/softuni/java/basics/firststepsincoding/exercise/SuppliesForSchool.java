package io.github.nikolager18.softuni.java.basics.firststepsincoding.exercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double pen = 5.80;
        double marker = 7.20;
        double cleaningAgent = 1.20;
        int pens = Integer.parseInt(scan.nextLine());
        int markers = Integer.parseInt(scan.nextLine());
        int litersCleaningAgent = Integer.parseInt(scan.nextLine());
        double percentDiscount = (Double.parseDouble(scan.nextLine())/100);
        double totalPens =pens * pen;
        double totalMarkers = markers * marker;
        double totalCleaningAgent = litersCleaningAgent * cleaningAgent;
        double totalSum = totalPens + totalMarkers + totalCleaningAgent;
        double totalSumDiscount =  totalSum - (totalSum * percentDiscount) ;
        System.out.printf("%.2f", totalSumDiscount);
    }
}
