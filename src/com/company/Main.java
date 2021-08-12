package com.company;

import java.util.Arrays;

/**
 * <h1>Java Intermediate Algorithms </h1>
 *
 * <p>Create a new IntelliJJ project called ( JavaAlgorithms810 ).
 *  Complete the following algorithms where each algorithm is store in a new class and the solution is in a method
 *  called "run".
 *  Spend the first 60 minutes of class working on the first two on your own. Then work on the last two as a group.
 *  Create the classes with the names above the links</p>
 *
 * <p>ArrayOfMultiples</p>
 * <a href="https://edabit.com/challenge/rzpucPyoyEtXPo2BG">https://edabit.com/challenge/rzpucPyoyEtXPo2BG</a>
 * <p>PerfectSquarePatch</p>
 * <a href="https://edabit.com/challenge/7Tb7qMDQHtz3xpydd">https://edabit.com/challenge/7Tb7qMDQHtz3xpydd</a>
 * <p>Reverse the String (with a catch)</p>
 * <a href="https://edabit.com/challenge/QdrLgb37ZZwYMKXwi">https://edabit.com/challenge/QdrLgb37ZZwYMKXwi</a>
 * <p>AtbashCipher</p>
 * <a href="https://edabit.com/challenge/JmuM2cP5MvruRjr6c">https://edabit.com/challenge/JmuM2cP5MvruRjr6c</a>
 *
 * <br>
 *
 * @since 10/8/2021
 * @author John Gillard
 * @version 10/8/2021
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("ArrayOfMultiples:");
        System.out.println("num 7, length 5 ➞ " + Arrays.toString(ArrayOfMultiples.run(7, 5)));
        // ➞ [7, 14, 21, 28, 35]
        System.out.println("num 12, length 10 ➞ " + Arrays.toString(ArrayOfMultiples.run(12, 10)));
        // ➞ [12, 24, 36, 48, 60, 72, 84,  96, 108, 120]
        System.out.println("num 17, length 5 ➞ " + Arrays.toString(ArrayOfMultiples.run(17, 5)));
        // ➞ [17, 34, 51, 68, 85, 102]

        System.out.println("\nPerfectSquarePatch:");
        int[][] squareArr = PerfectSquarePatch.run(3);
        System.out.printf("%s\n", Arrays.deepToString(squareArr).replace("], ", "],\n").replace("[[", "[").replace(
                "]]", "]"));
        squareArr = PerfectSquarePatch.run(5);
        System.out.printf("\n%s\n", Arrays.deepToString(squareArr).replace("], ", "],\n").replace("[[", "[").replace(
                "]]", "]"));
        squareArr = PerfectSquarePatch.run(1);
        System.out.printf("\n%s\n", Arrays.deepToString(squareArr).replace("], ", "],\n").replace("[[", "[").replace(
                "]]", "]"));
//        System.out.println(Arrays.deepToString(PerfectSquarePatch.intAsSquare(3)));
//        System.out.println(Arrays.deepToString(PerfectSquarePatch.intAsSquare(5)));
//        System.out.println(Arrays.deepToString(PerfectSquarePatch.intAsSquare(1)));

        System.out.println("\nReverseTheString:");
        System.out.println("Edabit ➞ " + ReverseTheString.run("Edabit")); // ➞ "Tibade"
        System.out.println("UPPER lower ➞ " + ReverseTheString.run("UPPER lower")); // ➞ "REWOL reppu"
        System.out.println("1 23 456 ➞ " + ReverseTheString.run("1 23 456")); // ➞ "6 54 321"

        System.out.println("\nAtbashCipher:");
        System.out.println("apple ➞ " + AtbashCipher.run("apple"));// ➞ "zkkov"
        System.out.println("Hello world! ➞ " + AtbashCipher.run("Hello world!")); // ➞ "Svool dliow!"
        System.out.println("Christmas is the 25th of December ➞ " + AtbashCipher.run("Christmas is the 25th of December"));
        // ➞ "Xsirhgnzh rh gsv 25gs lu Wvxvnyvi"
    }
}
