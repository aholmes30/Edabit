package easy;

public class IsTheAverageOfAllElementsAWholeNumber {

    public static boolean isAvgWhole(int[] arr) {
        //method name: isAvgWhole
        //method type: 4 -> return data is boolean, param is int[] arr

        int total = 0;  //create int total variable

        for(int i = 0; i < arr.length; i++) {  //traverse through array
            total = total + arr[i];  //set total to arr[i]
            if(total / 2 == 0)  //check if total is a whole number by using division
                return true;
        }
        return false;
    }
}

/*
Create a function that takes an array as an argument and returns true or false
depending on whether the average of all elements in the array is a whole number or not.

Examples
isAvgWhole([1, 3]) ➞ true
isAvgWhole([1, 2, 3, 4]) ➞ false
isAvgWhole([1, 5, 6]) ➞ true
isAvgWhole([1, 1, 1]) ➞ true
isAvgWhole([9, 2, 2, 5]) ➞ false
 */

