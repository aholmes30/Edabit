package easy;

public class IsTheStringAPalindrome {

    public static boolean checkPalindrome(String str) {
        //method name: checkPalindrome
        //method type: 4-> return data is boolean, param is String str


        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }

}

/*
A palindrome is a word that is identical forward and backwards.
mom
racecar
kayak
Given a word, create a function that checks whether it is a palindrome.
Examples
checkPalindrome("mom") ➞ true
checkPalindrome("scary") ➞ false
checkPalindrome("reviver") ➞ true
checkPalindrome("stressed") ➞ false
Notes
All test input is lower cased.
 */
