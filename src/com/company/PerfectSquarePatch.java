package com.company;

public class PerfectSquarePatch {

    /*
     * Create a function that takes an integer and outputs an n x n square solely consisting of the integer n.
     * If n = 0, return an empty array.
     */
    public static int[][] intAsSquare(int num){
        if(num == 0)
            return new int[0][0];

        int[][] squareArr = new int[num][num];

        for(int row = 0; row < num; row++){
            for(int col = 0; col < num; col++){
                squareArr[row][col] = num;
            }
        }

        return squareArr;
    }
}
