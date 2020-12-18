package easy;

public class GetWordCount {

    public static int countWords(String s) {

        String[] a = s.split(" ");  //create string array variable
        return a.length;
        //make sure that a string will be split into individ array
        //use the split() method
    }

    public static void main(String[] args) {
        System.out.println(countWords("Welcome to my home"));
    }
}


/*
Create a method that takes a string and returns the word count.
The string will be a sentence.

Examples
countWords("Just an example here move along") ➞ 6
countWords("This is a test") ➞ 4
countWords("What an easy task, right") ➞ 5
 */
