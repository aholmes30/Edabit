package easy;

import java.util.Arrays;

public class NthSmallestElement {

        public static int nthSmallest(int[] arr, int n) {
            if(n > arr.length)
                return -1;
            Arrays.sort(arr);
            return arr[n-1];
        }
}

/*
Given an unsorted array, create a function that returns the nth smallest element
(the smallest element is the first smallest, the second smallest element is the second smallest, etc).
Examples
nthSmallest([1, 3, 5, 7], 1) ➞ 1
nthSmallest([1, 3, 5, 7], 3) ➞ 5
nthSmallest([1, 3, 5, 7], 5) ➞ -1
nthSmallest([7, 3, 5, 1], 2) ➞ 3
Notes
n will always be >= 1.
Each number in the array will be distinct (there will be a clear ordering).
Given an out of bounds parameter (e.g. an array is of size k), and you are asked
to find the m > k smallest element, return -1.
 */