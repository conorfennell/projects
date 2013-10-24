package com.cafedead.text;

public class ReverseString
{
    private static final String ENTER_STRING_TO_REVERSE = "Enter string to reverse";

    public static void main( String[] args )
    {
        String string = getStringFromConsole(ENTER_STRING_TO_REVERSE);

        char[] charArray = string.toCharArray();
        char[] reverseCharArray = new char[string.length()];

        for(int startIndex = 0, endIndex = charArray.length -1 ; startIndex < charArray.length; startIndex++, endIndex--){
            reverseCharArray[startIndex] = charArray[endIndex];
        }

        System.out.println(reverseCharArray);
    }

    public static String getStringFromConsole(String message){
        String  string = System.console().readLine();
        return string;
    }
}
