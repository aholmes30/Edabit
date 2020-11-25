package veryEasy;

public class RecursionFactorials {

    public static int factorial(int n) {
        //method name: int factorial
        //method type: 4 -> return data is int, param is int n

        if (n == 0) return 1;
        return n * factorial(n - 1);
    }


    public static void main(String[] args) {

        System.out.println(factorial(4));

    }
}

/*
Write a function that calculates the factorial of a number recursively.

Examples
factorial(5) ➞ 120
factorial(3) ➞ 6
factorial(1) ➞ 1
factorial(0) ➞ 1
 */
