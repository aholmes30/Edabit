package veryEasy;

public class RemoveTheFirstAndLastCharacters {
    public static String removeFirstLast(String str) {
        //method name: removeFirstLast
        //method type: 4 -> return type is String, params are string str
        //use a for loop

        if(str.length() > 2) {
            return str.substring(1, str.length()-1);
        }
        return str;
    }

    public static void main(String[] args) {

        System.out.println(removeFirstLast("Star Wars"));
    }
}


/*
Create a function that removes the first and last characters from a string.
Examples
removeFirstLast("hello") ➞ "ell"
removeFirstLast("maybe") ➞ "ayb"
removeFirstLast("benefit") ➞ "enefi"
removeFirstLast("a") ➞ "a"
Notes
If the string is 2 or fewer characters long, return the string itself (See example #4).
 */