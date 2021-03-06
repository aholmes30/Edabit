package easy;

public class StutteringFunction {

    public static String stutter(String word) {
        //method name: stutter
        //method type: 4 -> return data is String, param is String word

        return word.substring(0,2) + "... " + word.substring(0,2) + "... " + word.substring(0) + "?";

    }

    public static void main(String[] args) {

        System.out.println(stutter("Are you okay?"));
    }
}

/*
Write a function that stutters a word as if someone is struggling to read it.
The first two letters are repeated twice with an ellipsis ... and space after each,
and then the word is pronounced with a question mark ?.
Examples
stutter("incredible") ➞ "in... in... incredible?"
stutter("enthusiastic") ➞ "en... en... enthusiastic?"
stutter("outstanding") ➞ "ou... ou... outstanding?"
Notes
Assume all inputs are in lower case and at least two-character long.
Check on the Resources tab for more helpful tips on String formatting in Java
 */