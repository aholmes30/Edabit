package veryEasy;

public class ReturnTheFactorial {
    public static int factorial(int num) {
        if (num == 0) return 1;
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {

        int num = 6;
        System.out.println(factorial(num));
    }
}

/*
Create a function that takes an integer and returns the factorial of that integer.
That is, the integer multiplied by all positive lower integers.

Examples
factorial(3) ➞ 6
factorial(5) ➞ 120
factorial(13) ➞ 6227020800
Notes
Assume all inputs are greater than or equal to 0.
 */
