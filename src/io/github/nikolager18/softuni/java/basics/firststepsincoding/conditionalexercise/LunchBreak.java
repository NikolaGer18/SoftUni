package io.github.nikolager18.softuni.java.basics.firststepsincoding.conditionalexercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String serial = scanner.nextLine();
        double episodeDuration = Double.parseDouble(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double lunchBreak = breakDuration * 0.125;
        double restBreak = breakDuration * 0.25;
        double timeLeft = breakDuration - restBreak - lunchBreak;

        if (timeLeft >= episodeDuration) {
            double freeTime = timeLeft - episodeDuration;
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serial, Math.ceil(freeTime));
        } else {
            double neededTime = episodeDuration - timeLeft;
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serial, Math.ceil(neededTime));
        }
    }
}
