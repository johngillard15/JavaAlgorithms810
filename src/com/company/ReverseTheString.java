package com.company;

public class ReverseTheString {

    /*
     * Reverse the String (with a catch)
     * Create a function that takes a string and returns the reversed string.
     * However, there's a few rules to follow in order to make the challenge interesting:
     * - The UPPERCASE/lowercase positions must be kept in the same order as the original string (see example #1 and #2).
     * - Spaces must be kept in the same order as the original string (see example #3).
     */
    public static String run(String str){
        String strReversed = new StringBuilder(str.replaceAll(" ", "")).reverse().toString().toLowerCase();

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            if(Character.isWhitespace(c))
                strReversed = strReversed.substring(0, i) + " " + strReversed.substring(i);
            else if(Character.isUpperCase(c)){
                c = Character.toUpperCase(strReversed.charAt(i));
                strReversed = strReversed.substring(0, i) + c + strReversed.substring(i + 1);
            }
        }

        return strReversed;
    }
}
