package com.company;

public class AtbashCipher {

    /*
     * The Atbash cipher is an encryption method in which each letter of a word is replaced with its "mirror" letter
     * in the alphabet: A <=> Z; B <=> Y; C <=> X; etc.
     * Create a function that takes a string and applies the Atbash cipher to it.
     */
    public static String run(String str){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder encrypted = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char c = str.toLowerCase().charAt(i);
            int index = alphabet.indexOf(c);

            if(index == -1) {
                encrypted.append(c);
            }
            else{
                int mirrorIndex = alphabet.length() - (index + 1);
                char cMirror = alphabet.charAt(mirrorIndex);

                if(Character.isUpperCase(str.charAt(i)))
                    encrypted.append(Character.toUpperCase(cMirror));
                else
                    encrypted.append(cMirror);
            }
        }

        return encrypted.toString();
    }
}
