package veryEasy;

public class AddAConsecutiveListOfNumbers {

    public static int addUpTo(int n) {
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(addUpTo(76));


    }


}

/*
Write a function that takes the last number of a consecutive list of numbers
and returns the total of all numbers up to and including it.
Examples
addUpTo(3) ➞ 6
// 1 + 2 + 3 = 6
addUpTo(10) ➞ 55
// 1 + 2 + 3 + ... + 10 = 55
addUpTo(7) ➞ 28
// 1 + 2 + 3 + ... + 7 = 28
Notes
You will only be given valid inputs.
There are various ways of doing this; try finding them!
 */
