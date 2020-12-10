package easy;

public class RepeatingLetterNTimes {

    public static String repeat(String str, int n) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < n; j++) {
                result += str.charAt(i);
            }
        }
        return result;
    }

}


/*
Create a function that repeats each character in a string n times.
Examples
repeat("mice", 5) ➞ "mmmmmiiiiiccccceeeee"
repeat("hello", 3) ➞ "hhheeellllllooo"
repeat("stop", 1) ➞ "stop"
Notes
N/A
 */