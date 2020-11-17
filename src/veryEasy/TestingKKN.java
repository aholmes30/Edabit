package veryEasy;

public class TestingKKN {

    public static boolean kToK(int n, int k) {

        if(Math.pow(k,k) == n) {  //Math.pow() is for exponents
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(kToK(6, 24));

    }


}

/*
Write a function that returns true if k^k == n for input (n, k) and return false otherwise.
Examples
kToK(4, 2) ➞ true
kToK(387420489, 9) ➞ true
// 9^9 == 387420489
kToK(3124, 5) ➞ false
kToK(17, 3) ➞ false
Notes
The ^ operator refers to exponentiation operation, not the bitwise XOR operation.
 */


