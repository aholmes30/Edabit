package veryEasy;

public class HittingtheJackpot {

    public static boolean testJackpot(String[] result) {
        for (int i = 1 ; i < result.length ; i++) {
            if (result[i] != result[i-1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String[] result = {"&&", "&", "&&&", "&&&&"};
        System.out.println(testJackpot(result));
    }


}

/*
Create a function that takes in an array (slot machine outcome) and returns
true if all elements in the array are identical, and false otherwise. The array will contain 4 elements.

Examples
testJackpot(["@", "@", "@", "@"]) ➞ true
testJackpot(["abc", "abc", "abc", "abc"]) ➞ true
testJackpot(["SS", "SS", "SS", "SS"]) ➞ true
testJackpot(["&&", "&", "&&&", "&&&&"]) ➞ false
testJackpot(["SS", "SS", "SS", "Ss"]) ➞ false
Notes
The elements must be exactly identical for there to be a jackpot.
 */
