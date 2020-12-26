package veryEasy;

public class ReturnStringAsAnInteger {

    public static int stringInt(String str) {

        return new Integer(Integer.parseInt(str));

    }


}

/*
Create a function that takes a string and returns it as an integer.
Examples
stringInt("6") ➞ 6
stringInt("1000") ➞ 1000
stringInt("12") ➞ 12
Notes
All numbers will be whole.
All numbers will be positive.
 */
