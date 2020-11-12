package veryEasy;

public class MultipleOf100 {
    public static boolean divisible(int num) {
        if(num % 100 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(divisible(67));

    }

}

/*
Create a function that takes an integer and return true if it's divisible by 100, otherwise return false.
Examples
divisible(1) ➞ false
divisible(1000) ➞ true
divisible(100) ➞ true
 */
