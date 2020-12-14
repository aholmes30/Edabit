package easy;

public class EvenNumberGenerator {

    public static int[] findEvenNums(int num) {
        int[] e = new int[num/2];
        for(int i=2; i<=num; i+=2){
            e[i/2-1] = i;
        }
        return e;
    }

}

/*
Create a function that finds all even numbers from 1 to the given number.
Examples
findEvenNums(8) ➞ [2, 4, 6, 8]
findEvenNums(4) ➞ [2, 4]
findEvenNums(2) ➞ [2]
Notes
If there are no even numbers, return an empty array.
 */
