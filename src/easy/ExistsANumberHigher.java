package easy;

public class ExistsANumberHigher {

    public static boolean existsHigher(int[] arr, int n) {
        // return data: boolean
        // param: int[] arr, int n

        if(arr.length == 0) { //if empty array, return false
            return false;
        }
        for(int i = 0; i < arr.length; i++) {  //run through array with for loop
            if(arr[i] >= n) {  //check if arr[i] is greater than or equal to n
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {8, 56, 3, 4, 12, 67, 45};

        System.out.println(existsHigher(arr, 6));
    }
}

/*
Write a function that returns true if there exists at least one number that is larger than or equal to n.
Examples
existsHigher([5, 3, 15, 22, 4], 10) ➞ true
existsHigher([1, 2, 3, 4, 5], 8) ➞ false
existsHigher([4, 3, 3, 3, 2, 2, 2], 4) ➞ true
existsHigher([], 5) ➞ false
Notes
Return false for an empty array [].
 */
