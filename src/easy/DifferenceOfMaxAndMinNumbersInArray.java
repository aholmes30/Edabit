package easy;

public class DifferenceOfMaxAndMinNumbersInArray {

    public static int differenceMaxMin(int[] arr) {
        //method name: differenceMaxMin
        //method type: 4 -> return data is int, params are int[] arr

        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
            else if(arr[i] < min)
                min = arr[i];
        }
        return max - min;
    }
}

/*
Create a function that takes an array and returns the difference between the biggest and smallest numbers.

Examples
differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) ➞ 82
// Smallest number is -50, biggest is 32.

differenceMaxMin([44, 32, 86, 19]) ➞ 67
// Smallest number is 19, biggest is 86.
 */
