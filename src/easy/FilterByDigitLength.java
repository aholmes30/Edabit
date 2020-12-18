package easy;

public class FilterByDigitLength {


    public static int[] filterByLength(int[] numbers, int length) {
        int size = 0;
        for(int n=0;n<numbers.length;n++)
            if (String.valueOf(numbers[n]).length()==length)
                size++;
        int[] arr = new int[size];
        int index = 0;
        for(int i =0; i<numbers.length;i++)
            if (String.valueOf(numbers[i]).length()==length) {
                arr[index] += numbers[i];
                index++;
            }
        return arr;
    }

    public static void main(String[] args) {

        int[] numbers = {5, 7, 2, 45, 12, 89, 78};

        System.out.println(filterByLength(numbers, 2));
    }

}

/*
Write a function that filters an array of numbers based on the criteria set for the number of digits.

Examples
filterByLength([12, 2000, 13, 1979, 12, 17], 2)  ➞ [12, 13, 12, 17]
// An array of only the numbers with 2 digits.

filterByLength([88, 232, 4, 9721, 555], 3) ➞ [232, 555]
// An array of only the numbers with 3 digits.

filterByLength([2, 7, 8, 9, 1012], 1) ➞ [2, 7, 8, 9]
// An array of only the numbers with a single digit.

filterByLength([32, 88, 74, 91, 300, 4050], 1) ➞ []
// No numbers with only 1 digit exist, thus, an empty array.

filterByLength([5, 6, 8, 9], 1) ➞ [5, 6, 8, 9]
// All numbers in the array have 1 digit only, thus, the original array.
Notes
If no numbers of the specified digit length exist, return an empty array.
If all numbers in the array have the specified digit length, return the original array.
The returned sub-array should have the same relative order as the original array.
 */
