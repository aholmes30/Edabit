package veryEasy;

public class OwoifiedSentence {

    public static String owofied(String sentence) {
        //method name: owofied
        //method type: 4 -> return data is String, params are String sentence

        String addedWord = " owo";  //create new string for "owo"
        String replace = sentence.replaceAll("i", "wi").replace("e", "we");
        return replace + addedWord;

    }
}

/*
Create a function that takes a sentence and turns every "i" into "wi" and "e" into "we", and add "owo" at the end.

Examples
owofied("I'm gonna ride 'til I can't no more")
➞ "I'm gonna rwidwe 'twil I can't no morwe owo"

owofied("Do you ever feel like a plastic bag")
➞ "Do you wevwer fwewel lwikwe a plastwic bag owo"

owofied("Cause baby you're a firework")
➞ "Causwe baby you'rwe a fwirwework owo"
Notes
 */
