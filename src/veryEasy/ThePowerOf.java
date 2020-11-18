package veryEasy;

public class ThePowerOf {

    public static int calculateExponent(int num, int exp) {
        int result  = 1;
        for (int i = 0; i < exp; i++) {
            result = result * num;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(calculateExponent(2, 4));

    }
}

/*
Create a function that takes a base number and an exponent number and returns the calculation.
Examples
calculateExponent(5, 5) ➞ 3125
calculateExponent(10, 10) ➞ 10000000000
calculateExponent(3, 3) ➞ 27
Notes
All test inputs will be positive integers.
 */
