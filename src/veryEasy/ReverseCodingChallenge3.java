package veryEasy;

public class ReverseCodingChallenge3 {

    public static int[] mysteryFunc(int[] arr, int num) {
        for(int i = 0;i < arr.length; i++){
            arr[i] = arr[i] % num;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 1, 6, 7};

        System.out.println(mysteryFunc(arr, 8));
    }
}

/*
This is a reverse coding challenge. Normally you're given explicit directions with how to create a
function. Here, you must generate your own function to satisfy the relationship between the inputs and outputs.
Your task is to create a function that, when fed the inputs below, produce the sample outputs shown.
Examples
[5, 7, 8, 2, 1], 2 ➞ [1, 1, 0, 0, 1]
[9, 8, 16, 47], 4 ➞ [1, 0, 0, 3]
[17, 11, 99, 55, 23, 1], 5 ➞ [2, 1, 4, 0, 3, 1]
[6, 1], 7 ➞ [6, 1]
[3, 2, 9], 3 ➞ [0, 2, 0]
[48, 22, 0, 19, 33, 100], 10 ➞ [8, 2, 0, 9, 3, 0]
 */
