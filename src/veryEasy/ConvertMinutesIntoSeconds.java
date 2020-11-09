package veryEasy;


public class ConvertMinutesIntoSeconds {

    public static int convert(int minutes) {

        int seconds = minutes * 60;     //store the conversion into seconds
        return seconds;

 }

    public static void main(String[] args) {
        System.out.println(convert(77));
    }

}


//Write a function that takes an integer minutes and converts it to seconds.
//
//Examples
//convert(5) ➞ 300
//
//convert(3) ➞ 180
//
//convert(2) ➞ 120
