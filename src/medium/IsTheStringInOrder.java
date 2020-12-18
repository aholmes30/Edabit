package medium;

import java.util.Arrays;

public class IsTheStringInOrder {

    public static boolean isInOrder(String str){
        // return data is boolean
        // param is String

        char[] ch = new char [str.length()]; //char array of the length of str

        for(int i = 0; i < str.length(); i++) { //for loop to assign the str to char array
            ch[i] = str.charAt(i);
        }
        Arrays.sort(ch); //sort the array

        for(int i = 0; i < str.length(); i++) { //check is char array is = to str or not
            if (ch[i] != str.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isInOrder("Hello World"));
    }
}

/*
Create a function that takes a string and returns true or false,
depending on whether the characters are in order or not.

Examples
isInOrder("abc") ➞ true
isInOrder("edabit") ➞ false
isInOrder("123") ➞ true
isInOrder("xyzz") ➞ true
Notes
You don't have to handle empty strings.
 */
