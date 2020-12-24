package veryEasy;

public class IndexMultiplier {

    public static int indexMultiplier(int[] arr) {

            int value = 0;
            int sum = 0 ;

            for (int i = 0 ; i < arr.length ; i++) {
                value = arr[i] * i;
                sum = sum + value;
            }
            return sum;
        }

    public static void main(String[] args) {

        int[] arr = {5, 3, 1, 5, 7, 1};

        System.out.println(indexMultiplier(arr));
    }

}

/*
Return the sum of all items in an array, where each item is multiplied by its
index (zero-based). For empty arrays, return 0.
Examples
indexMultiplier([1, 2, 3, 4, 5]) ➞ 40
// (1*0 + 2*1 + 3*2 + 4*3 + 5*4)
indexMultiplier([-3, 0, 8, -6]) ➞ -2
// (-3*0 + 0*1 + 8*2 + -6*3)
 */
