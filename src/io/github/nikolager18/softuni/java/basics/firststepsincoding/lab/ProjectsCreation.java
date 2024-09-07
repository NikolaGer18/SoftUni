package io.github.nikolager18.softuni.java.basics.firststepsincoding.lab;

import java.util.Scanner;
public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int projectCount = scan.nextInt();
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name,projectCount*3,projectCount);
    }
}
