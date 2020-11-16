package veryEasy;

public class CheckStringForSpaces {

    public static boolean hasSpaces(String str) {

        return str.contains(" ");
    }


    public static void main(String[] args) {

        String result = "Happy Holidays, Everyone";
        System.out.println(hasSpaces(result));

    }

}



/*
Create a function that returns true if a string contains any spaces.
Examples
hasSpaces("hello") ➞ false
hasSpaces("hello, world") ➞ true
hasSpaces(" ") ➞ true
hasSpaces("") ➞ false
hasSpaces(",./!@#") ➞ false
Notes
An empty string does not contain any spaces.
Try doing this without RegEx.
 */
