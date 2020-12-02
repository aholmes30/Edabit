package easy;

public class CheckIfNumberIsPrime {

    public static boolean isPrime(int num) {

        if(num == 1) {
            return false;
        }
        for(int i = 2; i < num; i++) {   // num is the dividend (top)
            if(num % i == 0) {          //if whatever num is, modded by i and remainder is 0 (goes into i evenly)
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPrime(3));   // true because 3 is only divisble by itself and 1
        System.out.println(isPrime(4));   // false, 2 goes into 4 evenly
        System.out.println(isPrime(67));  // true
    }
}

/*
Create a function that returns true if a number is prime, and false otherwise.

A prime number is any positive integer that is evenly divisible by only two divisors: 1 and itself.

The first ten prime numbers are:
2, 3, 5, 7, 11, 13, 17, 19, 23, 29   //2 is only divisible by 1 and itself

Examples
isPrime(31) ➞ true
isPrime(18) ➞ false
isPrime(11) ➞ true
Notes
A prime number has no other factors except 1 and itself.
If a number is odd it is not divisible by an even number.
1 is not considered a prime number.
 */



