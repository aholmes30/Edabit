package veryEasy;

public class GiveMeTheEvenNumbers {

    public static int sumEvenNumsInRange(int start, int stop) {
        int out=0;
        for(int i=start;i<=stop;i++) {
            if(i%2==0) out += i;
        }
        return out;
    }
}

/*
Create a function that takes two parameters (start, stop), and returns the sum of all even numbers in the range.
Examples
sumEvenNumsInRange(10, 20) ➞ 90
// 10, 12, 14, 16, 18, 20
sumEvenNumsInRange(51, 150) ➞ 5050
sumEvenNumsInRange(63, 97) ➞ 1360
 */
