package veryEasy;

public class ReturnTheRemainderFromTwoNumbers {

    public static int remainder(int a, int b) {

        return a % b;
    }

    public static void main(String[] args) {

        System.out.println(remainder(3, 4));
    }

}

/*
There is a single operator in Java, capable of providing the remainder of a division
operation. Two numbers are passed as parameters.
The first parameter divided by the second parameter will have a remainder, possibly
zero. Return that value.

Examples
remainder(1, 3) ➞ 1
remainder(3, 4) ➞ 3
remainder(-9, 45) ➞ -9
remainder(5, 5) ➞ 0
Notes
The tests only use positive and negative integers.
 */
