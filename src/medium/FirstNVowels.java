package medium;

public class FirstNVowels {

    public static String firstNVowels(String str, int n) {
        //method name: firstNVowels
        //method type: 4 -> return data is String, param is String str, int n

        String vowel = "aeiou";
        String result = "";

        for(int z = 0; z < str.length(); z++) {
            if(vowel.contains(str.substring(z, z + 1))) {
                result += str.substring(z, z + 1);
            }
        }
        if(n > result.length()) {
            return "invalid";
        }
        return result.substring(0, n);
    }

}

/*
Write a function that returns the first n vowels of a string.
Examples
firstNVowels("sharpening skills", 3) ➞ "aei"
firstNVowels("major league", 5) ➞ "aoeau"
firstNVowels("hostess", 5) ➞ "invalid"
Notes
Return "invalid" if the n exceeds the number of vowels in a string.
Vowels are: a, e, i, o, u
 */
