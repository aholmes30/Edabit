package veryEasy;

public class ConcatenateFirstAndLastNameIntoOneString {
    public static String concatName(String firstName, String lastName) {
        return lastName +  "," + " " + firstName;

    }

    public static void main(String[] args) {
        System.out.println(concatName("Anna", "Holmes"));

    }
}

/*
Given two strings, firstName and lastName, return a single string in the format "last, first".
concatName("First", "Last") ➞ "Last, First"
concatName("John", "Doe") ➞ "Doe, John"
concatName("Mary", "Jane") ➞ "Jane, Mary"
 */
