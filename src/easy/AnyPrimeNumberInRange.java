package easy;

public class AnyPrimeNumberInRange {

    public static boolean checkPrime(int num){
        for(int i = 2; i < num/2; i++ ){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean PrimeNumberInRange(int n1, int n2) {
        for(int i = n1; i <= n2; i++ ){
            if(checkPrime(i)==true){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(PrimeNumberInRange(27, 80));
    }

}

/*
Create a function that returns true if there's at least one prime number in
the given range (n1 to n2 (inclusive)), false otherwise.
Examples
PrimeNumberInRange(10, 15) ➞ true
// Prime numbers in range: 11, 13
PrimeNumberInRange(62, 66) ➞ false
// No prime numbers in range.
PrimeNumberInRange(3, 5) ➞ true
// Prime numbers in range: 3, 5
Notes
n2 is always greater than n1.
n1 and n2 are always positive.
0 and 1 aren't prime numbers.
 */
