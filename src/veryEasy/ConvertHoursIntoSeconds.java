package veryEasy;

public class ConvertHoursIntoSeconds {

    public static int howManySeconds(int hours) {

        //hour * 60 = 60 min
        //60 min * 60 (seconds) = 3600 sec

        int mins = hours * 60;  //to get min
        int sec = mins * 60;   //to get sec

        return sec;

    }

    public static void main(String[] args) {

        System.out.println(howManySeconds(16));
    }
}


