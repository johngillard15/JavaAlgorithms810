package com.company;

public class ArrayOfMultiples {

    /*
     * Create a function that takes two numbers as arguments (num, length)
     * and returns an array of multiples of num until the array length reaches length.
     */
    public static int[] arrayOfMultiples(int num, int length){
        int[] arr = new int[length];

        for(int i = 1; i <= length; i++)
            arr[i - 1] = num * i;

        return arr;
    }
}
