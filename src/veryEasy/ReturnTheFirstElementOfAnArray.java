package veryEasy;

public class ReturnTheFirstElementOfAnArray {

    public static int getFirstValue(int[] arr) {

        return arr[0];

    }

    public static void main(String[] args) {

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 44;

        System.out.println(getFirstValue(arr));

        int[] result = {9, 4, 3, 5, 6, 12, 34};  //another way to initialize a new array of ints
        System.out.println(getFirstValue(result));
    }

}

/*
Create a function that takes an array and returns the first element.
Examples
getFirstValue([1, 2, 3]) ➞ 1
getFirstValue([80, 5, 100]) ➞ 80
getFirstValue([-500, 0, 50]) ➞ -500
Notes
The first element in an array always has an index of 0.
 */
