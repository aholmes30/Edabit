package veryEasy;

public class CountSyllables {

    public static int numberSyllables(String word) {
        String[] syl = word.split("-");
        return syl.length;
    }
}

/*
Create a function that counts the number of syllables a word has. Each syllable is separated with a dash -.

Examples
numberSyllables("buf-fet") ➞ 2
numberSyllables("beau-ti-ful") ➞ 3
numberSyllables("mon-u-men-tal") ➞ 4
numberSyllables("on-o-mat-o-poe-ia") ➞ 6
 */
