package easy;

public class SortNumbersInAscendingOrder {

    //with for loops

    public static int[] sortNumsAscending(int[] nums) {

        int temp;
        //looping structure to go through nums array
        for(int i = 0; i < nums.length; i++) {
            for(int x = 0; x < nums.length - i - 1; x++) {
                if(nums[x] > nums[x+1]) {
                    temp = nums[x];
                    nums[x] = nums[x+1];
                    nums[x+1] = temp;
                }
            }
        }
        return nums;
    }

    //with Arrays.sort() method:
    /*
    public static int[] sortNumsAscending(int[] nums) {
      Arrays.sort(nums);
      return nums;
    }
     */


}

/*
Create a method that takes an array of integers and returns a new array,
sorted in ascending order (smallest to biggest).

Sort integer array in ascending order.
If the function's argument is null, an empty array, or undefined; return an empty array.
Return a new array of sorted numbers.
Examples
sortNumsAscending([1, 2, 10, 50, 5]) ➞ [1, 2, 5, 10, 50]
sortNumsAscending([80, 29, 4, -95, -24, 85]) ➞ [-95, -24, 4, 29, 80, 85]
sortNumsAscending(null) ➞ []
sortNumsAscending([]) ➞ []
Notes
Test input can be positive or negative.
 */
