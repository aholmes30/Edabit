package easy;

public class CountOneInBinaryRepresentationOfInteger {

    public static int countOnes(int n) {
        String str = Integer.toBinaryString(n);
        int count = 0;
        for(int i = 0;i<str.length();i++)
            if(str.charAt(i) == '1') count++;
        return count;

    }
}

/*
Count the amount of ones in the binary representation of an integer.
For example, since 12 is 1100 in binary, the return value should be 2.

Examples
countOnes(0) ➞ 0
countOnes(100) ➞ 3
countOnes(999) ➞ 8
Notes
The input will always be a valid integer (number).
 */
