package medium;

public class RecursionArraySum {

    public static int sum(int[] arr) {
        //return data: int
        //param int[] arr (integer array)

        int resultSum = 0;

        if(arr.length < 1) {
            return 0;
        }
        for(int i = 0; i < arr.length; i++) {
            resultSum += arr[i];
        }
        return resultSum;
    }

}

/*
Write a function that finds the sum of an array. Make your function recursive.

Examples
sum([1, 2, 3, 4]) ➞ 10
sum([1, 2]) ➞ 3
sum([1]) ➞ 1
sum([]) ➞ 0
Notes
Return 0 for an empty array.
Check the Resources tab for info on recursion.
 */
