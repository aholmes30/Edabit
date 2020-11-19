package veryEasy;

public class ConvertNumberToCorrespondingMonthName {
    public static String monthName(int num) {

            switch(num){
                case 1: return "January";
                case 2: return "February";
                case 3: return "March";
                case 4: return "April";
                case 5: return "May";
                case 6: return "June";
                case 7: return "July";
                case 8: return "August";
                case 9: return "September";
                case 10: return "October";
                case 11: return "November";
                case 12: return "December";
                default: return "Error";
            }
    }

    public static void main(String[] args) {
        System.out.println(monthName(4));
    }
}

/*
Create a function that takes a number (from 1 to 12) and returns its corresponding
month name as a string. For example, if you're given 3 as input, your function
should return "March", because March is the 3rd month.
Number	Month Name
1	January
2	February
3	March
4	April
5	May
6	June
7	July
8	August
9	September
10	October
11	November
12	December
Examples
monthName(3) ➞ "March"
monthName(12) ➞ "December"
monthName(6) ➞ "June"
Notes
You can expect only integers ranging from 1 to 12 as test input.
 */
