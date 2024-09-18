package io.github.nikolager18.softuni.java.basics.firststepsincoding.conditionallab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        if(figure.equals("square"))
        {
            double num =Double.parseDouble(scanner.nextLine());
            double square = Math.pow(num,2);
            System.out.printf("%.3f",square);
        }
        else if(figure.equals("rectangle")){
            double num = Double.parseDouble(scanner.nextLine());
            double num2 = Double.parseDouble(scanner.nextLine());
            double rectangle = num * num2;
            System.out.printf("%.3f",rectangle);
        }
        else if (figure.equals("triangle")) {
            double num=Double.parseDouble(scanner.nextLine());
            double num2 = Double.parseDouble(scanner.nextLine());
            double triangle = num * (num2*0.5);
            System.out.printf("%.3f",triangle);
        }
        else if(figure.equals("circle"))
        {
            double num = Double.parseDouble(scanner.nextLine());
            double circle = Math.PI * Math.pow(num,2);
            System.out.printf("%.3f",circle);
        }
        }
    }

