package veryEasy;

public class CheckStringForSpaces {

    public static int arraySum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 12, 90};
        System.out.println(arraySum(arr));


    }

}



/*
Create a function that takes an array and returns the sum of all numbers in the array.
Examples
sum([2, 7, 4]) ➞ 13
sum([45, 3, 0]) ➞ 48
sum([-2, 84, 23]) ➞ 105
 */
