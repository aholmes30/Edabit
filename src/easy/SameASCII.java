package easy;

public class SameASCII {

    public static boolean sameAscii(String a, String b) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < a.length(); i++){
            sum1 += (int) a.charAt(i);
        }
        for(int j = 0; j< b.length(); j++){
            sum2 += (int) b.charAt(j);
        }
        return sum1 == sum2;
    }
}

/*
Return true if the sum of ASCII values of the first string is same as the sum of
ASCII values of the second string, otherwise return false.
Examples
sameAscii("a", "a") ➞ true
sameAscii("AA", "B@") ➞ true
sameAscii("EdAbIt", "EDABIT") ➞ false
Notes
If you need some help with ASCII codes, check the Resources tab for an image of all ASCII codes used in this challenge.
 */
