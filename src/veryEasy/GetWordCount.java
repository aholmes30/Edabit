package veryEasy;

public class GetWordCount {

    public static int countWords(String s) {
        return s.split(" ").length;
    }

    public static void main(String[] args) {

        System.out.println(countWords("Hello World"));
    }
}

/*
Create a method that takes a string and returns the word count. The string will be a sentence.

Examples
countWords("Just an example here move along") ➞ 6
countWords("This is a test") ➞ 4
countWords("What an easy task, right") ➞ 5
 */
