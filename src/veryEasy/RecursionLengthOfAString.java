package veryEasy;

public class RecursionLengthOfAString {
    public static int length(String str) {

    	return str.length();

}

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(length(str));
    }


}
/*
Write a function that returns the length of a string. Make your function recursive.
Examples
length("apple") ➞ 5
length("make") ➞ 4
length("a") ➞ 1
length("") ➞ 0
 */
