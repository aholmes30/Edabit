package veryEasy;

public class SumOfCubes {
    public static int sumOfCubes(int[] nums) {

        //method name: sumOfCubes
        //method type: 4 --> return data is int and params are int[] nums

        //going to use a for loop to iterate through array
        //go through each element and cube it
        //then add the entire array of elements after cubed to get sum

        int sum = 0;  //start the sum at 0
        for (int x = 0; x < nums.length; x++) {
            sum = sum + nums[x] * nums[x] * nums[x];  //cubed
        }
        return sum;

    }

}


/*
Create a function that takes in an array of numbers and returns the sum of its cubes.
Examples
sumOfCubes([1, 5, 9]) ➞ 855
// Since 1^3 + 5^3 + 9^3 = 1 + 125 + 729 = 855
sumOfCubes([3, 4, 5]) ➞ 216
sumOfCubes([2]) ➞ 8
sumOfCubes([]) ➞ 0
Notes
If given an empty array, return 0.
 */
