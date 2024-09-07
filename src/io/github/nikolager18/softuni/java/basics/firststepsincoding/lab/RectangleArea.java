package io.github.nikolager18.softuni.java.basics.firststepsincoding.lab;
import java.util.Scanner;

public class RectangleArea{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int area = length * width;
        System.out.println(area);
        scanner.close();
    }
}
