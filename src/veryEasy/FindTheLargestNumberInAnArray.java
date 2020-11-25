package veryEasy;

public class FindTheLargestNumberInAnArray {

    public static int findLargestNum(int[] nums) {
        //method name: findLargestNum
        //method type: 4 -> return data is int, takes int[] nums params

        int max = nums[0];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max)
                max = nums[i];
        }
        return max;
    }

}

/*
Create a method that takes an array of integers. Return the largest integer in the array.

Examples
findLargestNum([4, 5, 1, 3]) ➞ 5
findLargestNum([300, 200, 600, 150]) ➞ 600
findLargestNum([1000, 1001, 857, 1]) ➞ 1001
Notes
Expect either a positive number or zero (there are no negative numbers).
 */
