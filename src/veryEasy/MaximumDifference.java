package veryEasy;

import java.util.Arrays;

public class MaximumDifference {

    public static int difference(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1] - nums[0];
    }

    public static void main(String[] args) {

        int[] arr = {6, 7, 1, 45, 13, 55};
        System.out.println(difference(arr));
    }

}

/*
Given an array of integers, return the difference between the largest and smallest integers in the array.
Examples
difference([10, 15, 20, 2, 10, 6]) ➞ 18
# 20 - 2 = 18
difference([-3, 4, -9, -1, -2, 15]) ➞ 24
# 15 - (-9) = 24
difference([4, 17, 12, 2, 10, 2]) ➞ 15
 */
