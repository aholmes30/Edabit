package easy;

public class CheckIfStringMatchesSecondString {


    public static boolean checkEnding(String str1, String str2) {

        return str1.endsWith(str2);

    }
}


/*
Create a function that takes two strings and returns true if the first string
ends with the second string; otherwise return false.

Examples
checkEnding("abc", "bc") ➞ true
checkEnding("abc", "d") ➞ false
checkEnding("samurai", "zi") ➞ false
checkEnding("feminine", "nine") ➞ true
checkEnding("convention", "tio") ➞ false
Notes
All test cases are valid one word strings.
 */
