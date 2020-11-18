package veryEasy;

public class OnOffSwitches {

    public static int posCom(int n) {
        return (int) Math.pow(2, n);
    }

    public static void main(String[] args) {

        System.out.println(posCom(12));


    }
}

/*
Create a function that returns how many possible outcomes can come from a certain
number of switches (on / off). In other words, for a given number of switches,
how many different combinations of on and off can we have?

Examples
posCom(1) ➞ 2

posCom(3) ➞ 8

posCom(10) ➞ 1024
Notes
All numbers will be whole and positive.
 */
