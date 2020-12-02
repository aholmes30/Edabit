package easy;

public class FindTheSecondLargestNumber {
    public static int secondLargest(int[] num) {

        int max1 = num[0]; //assume that first and second elements are first and second max
    int max2 = num[1]; //then take each element of array and compare it with 2nd max
    //compare 2nd max with 1st. It it's bigger, swap them.

		for(int i = 2; i < num.length; i++) {
        if(num[i] > max2) {
            max2 = num[i];
        }
        if(max2 > max1) {
            int temp = max1;
            max1 = max2;
            max2 = temp;
        }
    }
	   return max2;
}

}

/*
Write a function that takes an array of numbers and returns the second largest number.

Examples
secondLargest([10, 40, 30, 20, 50]) ➞ 40
secondLargest([25, 143, 89, 13, 105]) ➞ 105
secondLargest([54, 23, 11, 17, 10]) ➞ 23
Notes
Unique numbers are in the array, at least.
 */
