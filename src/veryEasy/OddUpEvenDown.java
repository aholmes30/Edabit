package veryEasy;

public class OddUpEvenDown {

    public static int[] transform(int[] arr) {

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    arr[i] = arr[i] -1;
                }else {
                    arr[i] = arr[i] + 1;
                }
            }
            return arr;
        }

    public static void main(String[] args) {

        int[] arr = {3, 1, 5, 6, 7};
        System.out.println(transform(arr));
    }
    }


/*
Create a function that goes through the array, incrementing (+1) for each
odd-valued number and decrementing (-1) for each even-valued number.

Examples
transform([1, 2, 3, 4, 5]) ➞ [2, 1, 4, 3, 6]
transform([3, 3, 4, 3]) ➞ [4, 4, 3, 4]
transform([2, 2, 0, 8, 10]) ➞ [1, 1, -1, 7, 9]
 */
