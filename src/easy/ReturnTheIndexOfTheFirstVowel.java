package easy;

public class ReturnTheIndexOfTheFirstVowel {

    public static int firstVowel(String str) {
        String str1 = str.toLowerCase();
        int result = 0;
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u'){
                result = i;
                break;
            }
        }
        return result;
    }
}

/*
Create a function that returns the index of the first vowel in a string.

Examples
firstVowel("apple") ➞ 0
firstVowel("hello") ➞ 1
firstVowel("STRAWBERRY") ➞ 3
firstVowel("pInEaPPLe") ➞ 1
Notes
Input will be single words.
Characters in words will be upper or lower case.
"y" is not considered a vowel.
Input always contains a vowel.
 */
