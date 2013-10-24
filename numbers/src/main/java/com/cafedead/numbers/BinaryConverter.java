package com.cafedead.numbers;

import org.apache.commons.lang3.ArrayUtils;

public class BinaryConverter {

    static final String PLEASE_ENTER_BINARY = "Please enter binary";

    public static void main(String[] args){
        double decimalEquivalent = 0;
        decimalEquivalent = convertBinaryToDecimal(getStringFromConsole(PLEASE_ENTER_BINARY));
        System.out.println(decimalEquivalent);
    }

    private static double convertBinaryToDecimal(String binaryString) {
        double decimalEquivalent = 0;
        char[] charArray;
        charArray = binaryString.toCharArray();
        ArrayUtils.reverse(charArray);
        for(int i = charArray.length - 1; i >= 0 ;i-- )  {
            switch(charArray[i]){
                case '1':
                    decimalEquivalent = decimalEquivalent + Math.pow(2,i);
            }
        }
        return decimalEquivalent;
    }

    public static String getStringFromConsole(String message){
        System.out.println(message);
        return System.console().readLine();
    }
}
