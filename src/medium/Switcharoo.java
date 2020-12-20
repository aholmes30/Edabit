package medium;

public class Switcharoo {

    public static String flipEndChars(String s) {

        if(s.length() < 2) {       //call the this method
            return "Incompatible.";
        }
        if(s.charAt(0) == s.charAt(s.length() - 1)) {
            return "Two's a pair.";
        }
        String newWord = s.substring(s.length() - 1, s.length());
        newWord = newWord + s.substring(1, s.length() - 1);
        newWord = newWord + s.substring(0, 1);
        return newWord;
    }
}

/*
Create a function that takes a string and returns a new string with its first and
last characters swapped, except under two conditions:

If the length of the string is less than two, return "Incompatible.".
If the first and last characters are the same, return "Two's a pair.".
Examples
flipEndChars("Cat, dog, and mouse.") ➞ ".at, dog, and mouseC"
flipEndChars("ada") ➞ "Two's a pair."
flipEndChars("Ada") ➞ "adA"
flipEndChars("z") ➞ "Incompatible."
Notes
Tests are case sensitive (e.g. "A" and "a" are not the same character).
 */
