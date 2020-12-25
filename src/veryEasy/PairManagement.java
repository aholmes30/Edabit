package veryEasy;

public class PairManagement {
    public static int[] makePair(int a, int b) {
        return new int[] {a, b};
    }

    public static void main(String[] args) {


        System.out.println(makePair(8, 9));
    }

}

/*
Given two arguments, return an array which contains these two arguments.

Examples
makePair(1, 2) ➞ [1, 2]

makePair(51, 21) ➞ [51, 21]

makePair(512124, 215) ➞ [512124, 215]
 */
