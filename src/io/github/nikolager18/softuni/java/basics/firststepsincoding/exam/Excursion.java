package io.github.nikolager18.softuni.java.basics.firststepsincoding.exam;

import java.util.Scanner;

public class Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int amountNight = Integer.parseInt(scanner.nextLine());
        int cardsTransport = Integer.parseInt(scanner.nextLine());
        int ticketsMuseum = Integer.parseInt(scanner.nextLine());

        int night = 20;
        double cardTransportPrice = 1.6;
        int ticketMuseumPrice = 6;

        double sumNights = amountNight * night;
        double cardTransportSum = cardsTransport * cardTransportPrice;
        double sumTicketsMuseum = ticketsMuseum * ticketMuseumPrice;

        double totalSum = sumNights + sumTicketsMuseum + cardTransportSum;
        double wholeGroupSum = totalSum * people;
        double sumWithPercent = wholeGroupSum + (wholeGroupSum * 0.25);

        System.out.printf("%.2f", sumWithPercent);
    }
}

