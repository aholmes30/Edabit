package veryEasy;

public class IsTheStringEmpty {
    public static boolean isEmpty(String str) {

        if (str == "") {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(isEmpty("HELLO"));

    }

}

/*
Create a function that returns true if a string is empty and false otherwise.
Examples
isEmpty("") ➞ true
isEmpty(" ") ➞ false
isEmpty("a") ➞ false
Notes
A string containing only whitespaces " " does not count as empty.
     */
