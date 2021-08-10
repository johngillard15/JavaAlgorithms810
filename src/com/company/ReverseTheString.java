package com.company;

public class ReverseTheString {
    /**
     * Reverse the String (with a catch)
     * Create a function that takes a string and returns the reversed string.
     * However there's a few rules to follow in order to make the challenge interesting:
     * - The UPPERCASE/lowercase positions must be kept in the same order as the original string (see example #1 and #2).
     * - Spaces must be kept in the same order as the original string (see example #3).
     */

    public static String reverseString(String str){
        // reverse with no spaces
        String strReversed = new StringBuilder(str.replaceAll(" ", "")).reverse().toString();

        /*
         * 1. reverse and get correct spacing
         * 2. get correct letter cases
         */

        // put spaces at correct position
        for(int i = 0; i < str.length(); i++){
            if(Character.isWhitespace(str.charAt(i)))
                strReversed = strReversed.substring(0, i) + " " + strReversed.substring(i);
        }

        // match letter cases
        strReversed = strReversed.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(Character.isUpperCase(c)){
                char cNew = Character.toUpperCase(strReversed.charAt(i));
                StringBuilder strTemp = new StringBuilder(strReversed);
                strTemp.setCharAt(i, cNew);
                strReversed = strTemp.toString();
            }
        }

        return strReversed;
    }
}
