package easy;

import java.util.Arrays;

public class IsTheWordAnIsogram {

    public static boolean isIsogram(String str) {
        str = str.toLowerCase();
        char[] c = str.toCharArray();
        Arrays.sort(c);
        for(int i = 0; i < c.length - 1; i++) {
            if(c[i] == c[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

/*
An isogram is a word that has no duplicate letters. Create a function that takes a
string and returns either true or false depending on whether or not it's an "isogram".
Examples
isIsogram("Algorism") ➞ true
isIsogram("PasSword") ➞ false
// Not case sensitive.
isIsogram("Consecutive") ➞ false
Notes
Ignore letter case (should not be case sensitive).
All test cases contain valid one word strings.
 */
