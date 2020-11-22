package veryEasy;

public class SmallerStringNumber {

    public static String smallerNum(String n1, String n2) {
        if(Integer.parseInt(n1) < Integer.parseInt(n2)){
            return n1;
        }else{
            return n2;
        }
    }


}

/*
Create a function that returns the smaller number.
Examples
smallerNum("21", "44") ➞ "21"
smallerNum("1500", "1") ➞ "1"
smallerNum("5", "5") ➞ "5"
Notes
Numbers will be represented as strings, and your output should also be a string.
If both numbers tie, return either number.
Numbers will be positive.
Bonus: See if you can do this without converting to integers.
 */
