package veryEasy;

public class GenerateACountdownOfNumbersInAnArray {

    public static int[] countdown(int start) {
        //method name: countdown
        //method type: 4 -> return data is int[], params are int start

        int[] result = new int[start+1];
        for(int i = start; i >= 0; i--) {
            result[start-i] = i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countdown(5));
    }
}


/*
Create a function that takes a number as an argument and returns an array
of numbers counting down from this number to zero.

Examples
countdown(5) ➞ [5, 4, 3, 2, 1, 0]
countdown(1) ➞ [1, 0]
countdown(0) ➞ [0]
Notes
The argument will always be greater than or equal to zero.
 */
