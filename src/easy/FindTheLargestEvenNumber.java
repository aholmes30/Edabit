package easy;

import java.util.Arrays;

public class FindTheLargestEvenNumber {


    public static int probe(int[] r) {
        Arrays.sort(r);
        for (int i=r.length-1;i>=0;i--) {
            if (r[i]%2==0) {
                return r[i];
            }
        }
        return -1;
    }
}

/*
Write a function that finds the largest even number in an array and returns -1 if not found.
Examples
probe([3, 7, 2, 1, 7, 9, 10, 13]) ➞ 10
probe([1, 3, 5, 7]) ➞ -1
probe([0, 19, 18973623]) ➞ 0
Notes
Consider using the modulo operator % or the bitwise and operator &.
The use of built-in methods, such as Math.max(),Stream.sorted(), IntStream.of(), and even
integer binary operators, are favored.
 */
