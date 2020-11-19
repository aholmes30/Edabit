package veryEasy;

public class StringToIntegerAndViceVersa {

    public static int toInt(String str) {
        return Integer.parseInt(str);
    }


    public static String toStr(int num) {
        return Integer.toString(num);
    }
}


/*
Write two functions:
toInt() : A function to convert a string to an integer.
toStr() : A function to convert an integer to a string.
Examples
toInt("77") ➞ 77
toInt("532") ➞ 532

toStr(77) ➞ "77"

toStr(532) ➞ "532"
 */
