package easy;

public class CapitalizeTheFirstLetterOfEachWord {

    public static String makeTitle(String s) {

        String result = s.substring(0, 1).toUpperCase();

        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i-1) == ' ') {
                result += s.substring(i, i + 1).toUpperCase();
            } else {
                result += s.substring(i, i + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(makeTitle("i love oranges"));
    }

}

/*
Create a method that takes a string as an argument and converts the first character
of each word to uppercase. Return the newly formatted string.

Examples
makeTitle("This is a title") ➞ "This Is A Title"
makeTitle("capitalize every word") ➞ "Capitalize Every Word"
makeTitle("I Like Pizza") ➞ "I Like Pizza"
makeTitle("PIZZA PIZZA PIZZA") ➞ "PIZZA PIZZA PIZZA"
Notes
You can expect a valid string for each test case.
Some words may contain more than one uppercase letter (see example #4).
 */
