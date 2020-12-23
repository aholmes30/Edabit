package medium;

public class NextPrime {

    public static int nextPrime(int num) {
        for(int i=num; i<50; i++) {
            boolean isPrime = true;
            for(int j=2; j<num; j++) {
                if(i%j==0) isPrime = false;
            }
            if(isPrime) return i;
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(nextPrime(24));
    }


}

/*
Given an integer, create a function that returns the next prime.
If the number is prime, return the number itself.

Examples
nextPrime(12) ➞ 13
nextPrime(24) ➞ 29
nextPrime(11) ➞ 11
// 11 is a prime, so we return the number itself.
 */
