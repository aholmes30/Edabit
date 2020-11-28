package veryEasy;

public class MakeMyWayHome {


    public static int distanceHome(int[] dist) {
        int sum = 0;
        for (int i = 0; i < dist.length; i++) {
            sum += dist[i];
        }
        return Math.abs(sum);
    }
}

/*
You will be given an array, showing how far James travels away from his
home for each day. He may choose to travel towards or away from his house, so negative values are to be expected.
Create a function which calculates how far James must walk to get back home.

Examples
distanceHome([2, 4, 2, 5]) ➞ 13
distanceHome([-1, -4, -3, -2]) ➞ 10
distanceHome([3, 4, -5, -2]) ➞ 0
 */
