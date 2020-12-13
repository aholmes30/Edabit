package easy;

import java.util.Arrays;

public class AlphabetSoup {

    public static String AlphabetSoup(String s) {
        //return data: String
        //param: String s

        char charArray[] = s.toCharArray();
        Arrays.sort(charArray);
        String result = String.valueOf(charArray); //used String.valueOf() method
        return result;
    }

}

/*
Create a method that takes a string and returns a string with its letters in alphabetical order.
Examples
AlphabetSoup("hello") ➞ "ehllo"
AlphabetSoup("edabit") ➞ "abdeit"
AlphabetSoup("hacker") ➞ "acehkr"
AlphabetSoup("geek") ➞ "eegk"
AlphabetSoup("javascript") ➞ "aacijprstv"
Notes
You can assume numbers and punctuation symbols won't be included in test cases. You'll only have
to deal with single word, alphabetic characters.
 */
