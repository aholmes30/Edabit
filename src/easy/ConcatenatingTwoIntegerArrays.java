package easy;

public class ConcatenatingTwoIntegerArrays

        public static int[] concat(int[] arr1, int[] arr2) {
            // return data: int[]
            // param: int[] arr1, int[] arr2[]

            int[] result = new int[arr1.length + arr2.length];
            System.arraycopy(arr1, 0, result, 0, arr1.length);
            System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
            return result;
        }

}


/*Create a function to concatenate two integer arrays.
        Examples
        concat([1, 3, 5], [2, 6, 8]) ➞ [1, 3, 5, 2, 6, 8]

        concat([7, 8], [10, 9, 1, 1, 2]) ➞ [7, 8, 10, 9, 1, 1, 2]

        concat([4, 5, 1], [3, 3, 3, 3, 3]) ➞ [4, 5, 1, 3, 3, 3, 3, 3]
        */

