package veryEasy;

public class CompareStringsByCountOfCharacters {
    public static boolean comp(String str1, String str2) {
        return str1.length() == str2.length();

    }

    public static void main(String[] args) {
        System.out.println(comp("hello", "goodbye"));
    }

}

/*
Create a function that takes two strings as arguments and return either
true or false depending on whether the total number of characters in the
first string is equal to the total number of characters in the second string.
Examples
comp("AB", "CD") ➞ true
comp("ABC", "DE") ➞ false
comp("hello", "edabit") ➞ false
 */
