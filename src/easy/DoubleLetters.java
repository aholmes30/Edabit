package easy;

public class DoubleLetters {

    public static boolean doubleLetters(String word) {
        //method name: doubleLetters
        //method type = 4-> return data is boolean, param is String

        for(int i = 0; i < word.length()-1; i++) {
            if(word.charAt(i) == word.charAt(i+1))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(doubleLetters("Hello World"));
    }
}


/*
Create a function that takes a word and returns true if the word has two consecutive identical letters.

Examples
doubleLetters("loop") ➞ true
doubleLetters("yummy") ➞ true
doubleLetters("orange") ➞ false
doubleLetters("munchkin") ➞ false
Notes
 */