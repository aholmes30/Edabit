package easy;

public class HashesAndPluses {

    public static int[] hashPlusCount(String s) {
        int hashCount = 0;
        int plusCount = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '#'){
                hashCount++;
            } else if(s.charAt(i) == '+'){
                plusCount++;
            }
        }
        return new int [] {hashCount, plusCount};
    }

}

/*
Create a function that returns the number of hashes and pluses in a string.

Examples
hashPlusCount("###+") ➞ [3, 1]
hashPlusCount("##+++#") ➞ [3, 3]
hashPlusCount("#+++#+#++#") ➞ [4, 6]
hashPlusCount("") ➞ [0, 0]
Notes
Return [0, 0] for an empty string.
Return in the order of [hashes, pluses].
 */
