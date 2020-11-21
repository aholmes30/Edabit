package veryEasy;

public class ReturnFirstAndLastElementsInAnArray {

    public static String[] firstLast(String[] arr) {

        String firstElement = arr[0];
        String lastElement = arr[arr.length - 1];
        String[] result = {firstElement, lastElement};
        return result;
    }

}


/*
Create a function that takes an array of strings and return the first and last elements as a new array.
Examples
firstLast(["one", "two"]) ➞ ["one", "two"]
firstLast(["edabit", "13", "true"]) ➞ ["edabit", "true"]
firstLast(["zero"]) ➞ ["zero"]
Notes
Test input will always contain a minimum of two elements within the array.
 */
