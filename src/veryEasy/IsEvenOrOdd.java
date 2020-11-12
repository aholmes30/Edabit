package veryEasy;

public class IsEvenOrOdd {
    public static String isEvenOrOdd(int num) {
        if(num % 2 == 0) {
            return "even";
        }
        return "odd";
    }


    public static void main(String[] args) {
        System.out.println(isEvenOrOdd(34));
    }
}



/*
Create a method that takes an integer as an argument and returns"even" for even integers and "odd" for odd integers.
Examples
isEvenOrOdd(3) ➞ "odd"
isEvenOrOdd(146) ➞ "even"
isEvenOrOdd(19) ➞ "odd"
Notes
Dont forget to return the result.
Input will always be a valid integer.
Expect negative integers (whole numbers).
Tests are case sensitive (return "even" or "odd" in lowercase).
 */
