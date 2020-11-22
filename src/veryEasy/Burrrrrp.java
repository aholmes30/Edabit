package veryEasy;

public class Burrrrrp {

    public static String longBurp(int n) {

            String a = "";
            for(int i = 0; i < n; i++)
                a += "r";
            return "Bu" + a + "p";
        }

}

/*
Create a function that returns the string "Burp" with the amount of "r's" determined
by the input parameters of the function.
Examples
longBurp(3) ➞ "Burrrp"
longBurp(5) ➞ "Burrrrrp"
longBurp(9) ➞ "Burrrrrrrrrp"
Notes
Expect num to always be >= 1.
Remember to use a capital "B".
 */
