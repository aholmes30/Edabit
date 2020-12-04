package easy;

public class ReverseTheOrderOfAString {

    public static String reverse(final String str) {

        String result = "";  //create a String var and set it to empty for later

        for(int i = str.length()-1; i >= 0; i --) {
            result = result + str.charAt(i);
        }
        return result;
    }
}

/*
Create a method that takes a string as its argument and returns the string in reversed order.

Examples
reverse("Hello World") ➞ "dlroW olleH"
reverse("The quick brown fox.") ➞ ".xof nworb kciuq ehT"
reverse("Edabit is really helpful!") ➞ "!lufpleh yllaer si tibadE"
Notes
You can expect a valid string for all test cases.
 */
