package com.cafedead.text;

public class CountVowels {
    private static final char[] vowels = {'A', 'E', 'I', 'O', 'U'};

    public static void main(String[] args) {
        String stringToCheck = args[0].toUpperCase();
        int numberOfVowels = 0;

        for (char letter : stringToCheck.toCharArray()) {
            for (int i = 0; i < vowels.length; i++) {
                if (letter == vowels[i]) {
                    numberOfVowels++;
                    break;
                }
            }
        }
        System.out.println(numberOfVowels);
    }
}
