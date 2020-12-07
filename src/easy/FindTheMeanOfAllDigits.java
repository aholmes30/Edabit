package easy;

public class FindTheMeanOfAllDigits {

    public static int mean(int a) {
        char[] chartoSum = String.valueOf(a).toCharArray();
        int sumOfDigits = 0;
        for (int i = 0; i < chartoSum.length; i++) {
            sumOfDigits+=Integer.parseInt(Character.toString(chartoSum[i]));
        }
        return (sumOfDigits/chartoSum.length);
    }
}

/*
Create a function that returns the mean of all digits.

Examples
mean(42) ➞ 3
mean(12345) ➞ 3
mean(666) ➞ 6
Notes
The mean of all digits is the sum of digits / how many digits there are
(e.g. mean of digits in 512 is (5+1+2)/3(number of digits) = 8/3=2).
The mean will always be an integer.
 */
