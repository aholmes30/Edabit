package veryEasy;

public class ConvertHoursAndMinutesIntoSeconds {
    public static int convert(int hours, int minutes) {

        return hours*60*60 + minutes*60;
    }


    public static void main(String[] args) {

        System.out.println(convert(4, 12));

    }

}

/*
Write a function that takes two integers (hours, minutes), converts them to seconds, and adds them.
Examples
convert(1, 3) ➞ 3780
convert(2, 0) ➞ 7200
convert(0, 0) ➞ 0
 */
