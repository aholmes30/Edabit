package veryEasy;

public class SimilarBread {

    public static boolean hasSameBread(String[] a, String[] b) {
        //method name: hasSameBread
        //method type: 4 -> return data is boolean, param is string[] a and string[] b

        if(a[0] == b[0] && a[2] == b[2]){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        String[] a = {"rye bread", "swiss cheese", "rye bread"};
        String[] b = {"wheat bread", "ham", "wheat bread"};
        System.out.println(hasSameBread(a, b));
    }
}

/*
Given two arrays, which represent two sandwiches, return whether both sandwiches use
the same type of bread. The bread will always be found at the start and end of the array.

Examples
hasSameBread(
  ["white bread", "lettuce", "white bread"],
  ["white bread", "tomato", "white bread"]
) ➞ true

hasSameBread(
  ["brown bread", "chicken", "brown bread"],
  ["white bread", "chicken", "white bread"]
) ➞ false

hasSameBread(
  ["toast", "cheese", "toast"],
  ["brown bread", "cheese", "toast"]
) ➞ false
 */
