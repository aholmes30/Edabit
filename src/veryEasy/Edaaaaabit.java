package veryEasy;

public class Edaaaaabit {

    public static String howManyTimes(int num) {
        String edabit = "Ed";
        for(int i = 0; i < num; i++){
            edabit = edabit + "a";
        }
        edabit = edabit + "bit";
        return edabit;
    }

    public static void main(String[] args) {

        System.out.println(howManyTimes(5));
    }

}

/*
Write a function that takes an integer and returns a string with the given number of "a"s in Edabit.
Examples
howManyTimes(5) ➞ "Edaaaaabit"
howManyTimes(0) ➞ "Edbit"
howManyTimes(12) ➞ "Edaaaaaaaaaaaabit"
Notes
The string must start with "Ed" and end with "bit".
You'll only be given integers as test input.
 */
