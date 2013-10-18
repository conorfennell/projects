package com.cafedead.numbers;


import java.util.concurrent.atomic.AtomicInteger;

public class ChangeCalculator {
    private static double ONE_CENT = 0.01;
    private static double FIVE_CENT = 0.05;
    private static double TEN_CENT = 0.10;
    private static double TWENTY_CENT = 0.20;
    private static double FIFTY_CENT = 0.50;
    private static double ONE_EURO = 1.00;

    public static void main(String args[]) {
        double money = 6.34;
        double cost = 4.11;

        double change = money - cost;

        double numberOfEur = Math.floor(change / ONE_EURO);
        change = change - numberOfEur;
        double numberOfFiftyCent = Math.floor((change) / FIFTY_CENT);
        change = change - numberOfFiftyCent * FIFTY_CENT;
        double numberOfTwentyCents = Math.floor((change) / TWENTY_CENT);
        change = change - numberOfTwentyCents * TWENTY_CENT;
        double numberOfTenCents = Math.floor((change) / TEN_CENT);
        change = change - numberOfTenCents * TEN_CENT;
        double numberOfFiveCents = Math.floor((change) / FIVE_CENT);
        change = change - numberOfFiveCents * FIVE_CENT;
        double numberOfOneCents = Math.floor(change / ONE_CENT);


        System.out.println(numberOfEur + " Euro " + numberOfFiftyCent + " Fifty " + numberOfTwentyCents + " Twenties " + numberOfTenCents + " Tens " + numberOfFiveCents + " Fives " + numberOfOneCents + " cents");

    }
}
