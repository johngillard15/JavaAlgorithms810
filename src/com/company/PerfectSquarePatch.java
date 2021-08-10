package com.company;

public class PerfectSquarePatch {

    /*
     * Create a function that takes an integer and outputs an n x n square solely consisting of the integer n.
     */
    public static int[][] intAsSquare(int num){
        if(num == 0)
            return new int[0][0];

        int[][] squareArr = new int[num][num];

        for (int i=0;i<num;i++) {
            for(int j=0;j<num;j++){
                squareArr[i][j] = num;
            }
        }

        return squareArr;
    }
}
