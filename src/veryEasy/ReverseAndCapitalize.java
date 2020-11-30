package veryEasy;

public class ReverseAndCapitalize {
    public static String reverseCapitalize(String str) {
        String s ="";
        for(int i = str.length()-1; i >= 0; i--){
            s += str.toUpperCase().charAt(i);
        }
        return s;
    }
}

/*
Create a function that takes a string of lowercase characters and returns that string reversed and in upper case.

Examples
reverseCapitalize("abc") ➞ "CBA"

reverseCapitalize("hellothere") ➞ "EREHTOLLEH"

reverseCapitalize("input") ➞ "TUPNI"
 */
