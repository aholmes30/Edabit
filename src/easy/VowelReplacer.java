package easy;

public class VowelReplacer {

    public static String replaceVowels(String str, char ch) {
        return str.replaceAll("[aeiou]", "" + ch);
    }

    public static void main(String[] args) {

        System.out.println(replaceVowels("Hello World", '%'));
    }
}

/*
Create a function that replaces all the vowels in a string with a specified character.

Examples
replaceVowels("the aardvark", '#') ➞ "th# ##rdv#rk"
replaceVowels("minnie mouse", '?') ➞ "m?nn?? m??s?"
replaceVowels("shakespeare", '*') ➞ "sh*k*sp**r*"
Notes
All characters will be in lower case.
 */
