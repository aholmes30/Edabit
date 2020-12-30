package veryEasy;

public class CheckIfTheSameCase {

    public static boolean sameCase(String str) {

        if(str == str.toUpperCase() || str == str.toLowerCase()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(sameCase("hi"));
    }


}

/*
Create a function that returns true if an input string contains only uppercase or only lowercase letters.

Examples
sameCase("hello") ➞ true
sameCase("HELLO") ➞ true
sameCase("Hello") ➞ false
sameCase("ketcHUp") ➞ false
 */
