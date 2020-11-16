package veryEasy;

public class BothZeroNegativeOrPositive {

    public static boolean both(int n1, int n2) {
        if (n1 < 0 && n2 < 0) {
            return true;
        }
        if (n1 > 0 && n2 > 0) {
            return true;
        }
        if (n1 == 0 && n2 == 0) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(both(4, 7));

    }
}

/*
Write a function that returns true if both numbers are:
Smaller than 0, OR ...
Greater than 0, OR ...
Exactly 0
Otherwise, return false.
Examples
both(6, 2) ➞ true
both(0, 0) ➞ true
both(-1, 2) ➞ false
both(0, 2) ➞ false
Notes
Inputs will always be two numbers.
 */