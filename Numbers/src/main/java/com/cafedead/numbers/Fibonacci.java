package com.cafedead.numbers;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static void main(String[] args) {
        int number = 8;

        int[] fibonacci = new int[number];
        int currentFibonacciNumber = 1;

        for (int i = 0; i < number; i++) {
            fibonacci[i] = currentFibonacciNumber;
            currentFibonacciNumber = currentFibonacciNumber + fibonacci[i];
            System.out.println(currentFibonacciNumber);
        }
    }
}
