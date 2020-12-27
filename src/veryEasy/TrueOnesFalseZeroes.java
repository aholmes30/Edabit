package veryEasy;

public class TrueOnesFalseZeroes {

    public static boolean[] integerBoolean(String bits) {
        boolean[] output = new boolean[bits.length()];
        for (int i = 0; i < bits.length(); i++)
            output[i] = bits.substring(i, i + 1).equals("1");
        return output;
    }

    public static void main(String[] args) {

        System.out.println(integerBoolean("001"));
    }
}

/*
Create a function that returns a converted array of boolean values from a
given bit string. Basically, a bit character 1 is true, otherwise, it's false.

Examples
integerBoolean("100101") ➞ [true, false, false, true, false, true]
integerBoolean("10") ➞ [true, false]
integerBoolean("001") ➞ [false, false, true]
Notes
Characters in the given bit string are obviously 1's and 0's only.
 */
