package veryEasy;

public class ReturnLastElementInAnArray {

    public static int getLastItem(int[] nums) {

        return nums[nums.length-1];  //returns last item in array

    }

    public static void main(String[] args) {
        int[] arr = {7, 34, 56, 12, 9};

        System.out.println(getLastItem(arr));
    }
}



/*
Create a method that accepts an array and returns the last item in the array.
Examples
getLastItem([1, 2, 3]) ➞ 3
getLastItem([0]) ➞ 0
getLastItem([-1, -3]) ➞ -3
 */
