package easy;

public class XsAndOxNobodyKnows {

    public static boolean getXO(String str) {

            int x = 0;
            int o = 0;

            for (char i : str.toCharArray()) {  //convert to char array
                if (i == ('x') || i == ('X')) {
                    x++;
                }
                if (i == ('O') || i == ('o')) {
                    o++;
                }
            }

            return x == o;
        }

    public static void main(String[] args) {

        System.out.println(getXO("xoxoxoxox"));
    }
    }


/*
Create a function that takes a string, checks if it has the same number of x's
and o's and returns either true or false.

Rules
Return a boolean value (true or false).
Return true if the amount of x's and o's are the same.
Return false if they aren't the same amount.
The string can contain any character.
When "x" and "o" are not in the string, return true.
Examples
getXO("ooxx") ➞ true
getXO("xooxx") ➞ false
getXO("ooxXm") ➞ true
// Case insensitive.
getXO("zpzpzpp") ➞ true
// Returns true if no x and o.
getXO("zzoo") ➞ false

Notes
Remember to return true if there aren't any x's or o's.
Must be case insensitive.
 */
