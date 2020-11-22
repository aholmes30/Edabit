package veryEasy;

public class ConvertNumberToStringOfDashes {

    public static String Go(int num) {
        String str = "";
        for(int i=0; i<num;i++){
            str+="-";
        }
        return str;
    }

}

/*
Create a function that takes a number (from 1 - 60) and returns a corresponding string of hyphens.
Examples
Go(1) ➞ "-"
Go(5) ➞ "-----"
Go(3) ➞ "---"
 */
