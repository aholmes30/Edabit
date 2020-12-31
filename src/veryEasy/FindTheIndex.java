package veryEasy;

public class FindTheIndex {

    public static int findIndex(String[] arr, String str) {
        for (int i = 0; i < arr.length; i++) {
            if (str.equals(arr[i]))
                return i;
        }
        return -1;

    }

    public static void main(String[] args) {

        String[] arr = {"cats", "parrots", "cats", "rabbits"};
        String str = "rabbits";
        System.out.println(findIndex(arr, str));
    }

}

/*
Create a function that takes an array and a string as arguments and return the index of the string.

Examples
findIndex(new String[]{"hi", "edabit", "fgh", "abc"}, "fgh") ➞ 2
findIndex(new String[]{"Red", "blue", "Blue", "Green"}, "blue") ➞ 1
findIndex(new String[]{"a", "g", "y", "d"}, "d") ➞ 3
findIndex(new String[]{"Pineapple", "Orange", "Grape", "Apple"}, "Pineapple") ➞ 0
 */
