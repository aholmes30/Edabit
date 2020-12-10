package easy;

public class RemoveEveryVowelFromAString {

    public static String removeVowels(String s) {
        //method name: removeVowels
        //method type: 4 --> return data is String, params are string

        //replace() method for String

        return s.replaceAll("[aeiouAEIOU]", "");

    }
}

/*
Create a function that takes a string and returns a new string with all vowels removed.
Examples
removeVowels("I have never seen a thin person drinking Diet Coke.")
➞ " hv nvr sn  thn prsn drnkng Dt Ck."
removeVowels("We're gonna build a wall!")
➞ "W'r gnn bld  wll!"
removeVowels("Happy Thanksgiving to all--even the haters and losers!")
➞ "Hppy Thnksgvng t ll--vn th htrs nd lsrs!"
Notes
"y" is not considered a vowel.
Expect a valid string for all test cases.
 */
