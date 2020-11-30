package veryEasy;

public class ShuffleTheName {

    public static String nameShuffle(String s) {
//s ---> contains Donald Trump"
//extract both names --> s.split() --> invoking the string object (s) to split
//processing: we need to return a string that says "Trump Donald"

        String[] nameParts = s.split(" ");
        //nameParts --> {"Donald, Trump"}
        String firstName = nameParts[0];
        String lastName = nameParts[1];
        String result = lastName + " " + firstName;
        return result;

    }
}

/*
Create a method that accepts a string (of a person's first and last name)
and returns a string with the first and last name swapped.

Examples
nameShuffle("Donald Trump") ➞ "Trump Donald"
nameShuffle("Rosie O'Donnell") ➞ "O'Donnell Rosie"
nameShuffle("Seymour Butts") ➞ "Butts Seymour"
 */