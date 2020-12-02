package easy;

public class ReformTheWord {

    public static String getWord(String left, String right) {
        //method name: getWord
        //method type: 4 -> return data is String, params are String left and String right

        String result = left.substring(0, 1).toUpperCase();
        result = result + left.substring(1) + right;


        return result;
        //toUpperCase();


    }

}

/*
A word has been split into a left part and a right part. Re-form the word by adding
both halves together, changing the first character to an uppercase letter.

Examples
getWord("seas", "onal") ➞ "Seasonal"
getWord("comp", "lete") ➞ "Complete"
getWord("lang", "uage") ➞ "Language"
 */
