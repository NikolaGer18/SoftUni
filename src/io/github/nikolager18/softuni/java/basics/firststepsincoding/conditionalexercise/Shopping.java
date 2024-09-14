package io.github.nikolager18.softuni.java.basics.firststepsincoding.conditionalexercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double petarBudget = Double.parseDouble(scanner.nextLine());
        int GPU = 250;
        double amountGPUs=Double.parseDouble(scanner.nextLine());
        double amountCPUs= Double.parseDouble(scanner.nextLine());
        double amountRAM = Double.parseDouble(scanner.nextLine());
        double priceCPU = (amountGPUs*250)* 0.35;
        double sumCPU = amountCPUs *priceCPU;
        double priceRAM = (amountGPUs*250)* 0.10;
        double sumRAM = amountRAM * priceRAM;
        double total = (amountGPUs * GPU) + sumCPU + sumRAM;
        if (amountGPUs > amountCPUs) {
            total *= 0.85;
        }
        if (petarBudget >= total) {
                System.out.printf("You have %.02f leva left!",petarBudget - total);
            }
            else if(total > petarBudget)
            {
                System.out.printf("Not enough money! You need %.02f leva more!",total - petarBudget);
            }

        }
    }

