package veryEasy;

public class SquaresAndCubes {

    public static boolean squaresAndCubes(int[] arr) {
        return (Math.sqrt(arr[0]) * arr[0] == arr[1]);
    }

    public static void main(String[] args) {

        int[] arr = {9, 27};
        System.out.println(squaresAndCubes(arr));
    }
}

/*
Create a function that takes an array of two numbers and checks if the square root
of the first number is equal to the cube root of the second number.

Examples
checkSquareAndCube([4, 8]) ➞ true

checkSquareAndCube([16, 48]) ➞ false

checkSquareAndCube([9, 27]) ➞ true
Notes
Remember to return either true or false.
 */
