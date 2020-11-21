package veryEasy;

public class FindTheIndexPart1 {
    public static int search(int[] arr, int item) {
        //method name: int search
        //method type: 4 --> return data is int, params are arr and int item
        //use a for loop
        //try linear search first

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == item)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {9, 67, 3, 12, 99};
        System.out.println(search(arr, 9));
    }
}

/*
Create a function that finds the index of a given item.
Examples
search([1, 5, 3], 5) ➞ 1
search([9, 8, 3], 3) ➞ 2
search([1, 2, 3], 4) ➞ -1
Notes
If the item is not present, return -1.
*/

