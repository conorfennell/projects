package com.cafedead.text;

public class PalindromeChecker {
    public static void main(String[] args){
        String testString ="y";
        boolean isPalindrome = true;

        for(int start = 0,end = testString.length() - 1 ;start < testString.length();start++,end-- ){
            if(testString.charAt(start) != testString.charAt(end)){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
