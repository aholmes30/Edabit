package easy;

public class HowManyVowels {

    public static int getCount(String str) {
        int vowelsCount = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a')
                vowelsCount++;
            if(str.charAt(i) == 'e')
                vowelsCount++;
            if(str.charAt(i) == 'i')
                vowelsCount++;
            if(str.charAt(i) == 'o')
                vowelsCount++;
            if(str.charAt(i) == 'u')
                vowelsCount++;
        }
        return vowelsCount;
    }
}


/*
Create a function that takes a string and returns the number (count) of vowels contained within it.

Examples
countVowels("Celebration") ➞ 5
countVowels("Palm") ➞ 1
countVowels("Prediction") ➞ 4
Notes
a, e, i, o, u are considered vowels (not y).
All test cases are one word and only contain letters.
 */