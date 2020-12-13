package easy;

public class ReturnTheMiddleCharacterOfAString {

    public static String getMiddle(String word) {
        if(word.length() % 2 != 0){
            return word.substring(word.length() / 2, word.length() / 2 + 1);
        } else{
            return word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
        }
    }


}

/*
Create a function that takes a string and returns the middle character(s).
If the word's length is odd, return the middle character. If the word's length is even,
return the middle two characters.
Examples
getMiddle("test") ➞ "es"
getMiddle("testing") ➞ "t"
getMiddle("middle") ➞ "dd"
getMiddle("A") ➞ "A"
Notes
All test cases contain a single word (as a string).
 */