package veryEasy;

public class AdditiveInverse {
    public static int[] additiveInverse(int[] arr) {
    for (int i = 0; i < arr.length; i++){
        arr[i] *= -1;
    }
		return arr;
   }

    public static void main(String[] args) {

        int[] arr = {-5, -25, 35};
        System.out.println(additiveInverse(arr));
    }
}

/*
A number added with its additive inverse equals zero. Create a function that
returns an array of additive inverses.
Examples
additiveInverse([5, -7, 8, 3]) ➞ [-5, 7, -8, -3]
additiveInverse([1, 1, 1, 1, 1]) ➞ [-1, -1, -1, -1, -1]
additiveInverse([-5, -25, 35]) ➞ [5, 25, -35]
 */
