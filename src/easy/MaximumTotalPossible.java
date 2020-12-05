package easy;

import java.util.Arrays;

public class MaximumTotalPossible {

    public static int maxTotal(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 5; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}

/*
Given an array of 10 numbers, return the maximum possible total made by summing just 5 of the 10 numbers.
Examples
maxTotal([1, 1, 0, 1, 3, 10, 10, 10, 10, 1]) ➞ 43
maxTotal([0, 0, 0, 0, 0, 0, 0, 0, 0, 100]) ➞ 100
maxTotal([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) ➞ 40
Notes
You can select any 5 numbers from the given array to form maximum possible total.
 */
