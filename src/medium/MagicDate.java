package medium;

public class MagicDate {

    public static boolean magic(String str) {

        String[] temp = str.split(" ");
        int day = Integer.valueOf(temp[0]);
        int month = Integer.valueOf(temp[1]);
        int year = Integer.valueOf(temp[2]);

        if(day * month == year % 10 || day * month == year % 100
                || day * month == year % 1000) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(magic("5 6 2020"));
    }

}

/*
You are to read each part of the date into its own integer type variable.
The year should be a 4 digit number. You can assume the user enters a correct date
formatted d m yyyy (no error checking required).

Determine whether the entered date is a magic date. Here are the rules for a magic date:

mm * dd is a 1-digit number that matches the last digit of yyyy or
mm * dd is a 2-digit number that matches the last 2 digits of yyyy or
mm * dd is a 3-digit number that matches the last 3 digits of yyyy
The program should then display true if the date is magic, or false if it is not.

Examples
Magic("1 1 2011") ➞ true
Magic("4 1 2001") ➞ false
Magic("5 2 2010") ➞ true
Magic("9 2 2011") ➞ false
 */
