package veryEasy;

public class DateFormat {

    public static String formatDate(String date) {
        String part[] = date.split("/");
        return part[2] + part[1] + part[0];
    }

    public static void main(String[] args) {

        System.out.println(formatDate("01/30/1990"));
    }
}

/*
Create a function that converts a date formatted as MM/DD/YYYY to YYYYDDMM.

Examples
formatDate("11/12/2019") ➞ "20191211"
formatDate("12/31/2019") ➞ "20193112"
formatDate("01/15/2019") ➞ "20191501"
Notes
Return value should be a string.
 */
