package veryEasy;

public class CheckIfAnArrayContainsAGivenNumber {

    public static boolean check(int[] arr, int el) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == el){
                return true;
            }
        }
        return false;
    }
}
/*
Write a function to check if an array contains a particular number.
Examples
check([1, 2, 3, 4, 5], 3) ➞ true
check([1, 1, 2, 1, 1], 3) ➞ false
check([5, 5, 5, 6], 5) ➞ true
check([], 5) ➞ false*
*/
