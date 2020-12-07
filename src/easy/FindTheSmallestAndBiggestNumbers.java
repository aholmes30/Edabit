package easy;

import java.util.Arrays;

public class FindTheSmallestAndBiggestNumbers {
    public static double[] minMax(double[] arr) {

        Arrays.sort(arr); //sort the array from smallest to largest
        return new double[] {arr[0], arr[arr.length-1]};

    }
}

/*
Create a function that takes an array of numbers and return both the minimum and maximum numbers, in that order.

Examples
minMax([1, 2, 3, 4, 5]) ➞ [1, 5]

minMax([2334454, 5]) ➞ [5, 2334454]

minMax([1]) ➞ [1, 1]
Notes
All test arrays will have at least one element and are valid.
 */
