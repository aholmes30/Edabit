package veryEasy;

public class FootballPoints {

    public static int footballPoints(int wins, int draws, int loses) {

        return wins*3 + draws*1 + loses*0;
    }

    public static void main(String[] args) {

        System.out.println(footballPoints(12, 6, 4));
    }
}


/*
Create a function that takes the number of wins, draws and losses and calculates the number
of points a football team has obtained so far.

wins get 3 points
draws get 1 point
losses get 0 points
Examples
footballPoints(3, 4, 2) ➞ 13
footballPoints(5, 0, 2) ➞ 15
footballPoints(0, 0, 1) ➞ 0
 */
