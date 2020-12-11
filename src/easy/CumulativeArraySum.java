package easy;

public class CumulativeArraySum {

    public static int[] cumulativeSum(int[] nums) {
        if(nums.length == 0){
            return nums;
        }
        for(int i = 0; i < nums.length - 1; i++){
            nums[i + 1] += nums[i];
        }
        return nums;
    }
}

/*
Create a method that takes an array of integers and returns an array where
each integer is the sum of itself + all previous numbers in the array.

Examples
cumulativeSum([1, 2, 3]) ➞ [1, 3, 6]
cumulativeSum([1, -2, 3]) ➞ [1, -1, 2]
cumulativeSum([3, 3, -2, 408, 3, 3]) ➞ [3, 6, 4, 412, 415, 418]
Notes
Return an empty array if the input is an empty array.
 */
