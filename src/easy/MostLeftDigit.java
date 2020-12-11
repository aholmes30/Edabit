package easy;

public class MostLeftDigit {

    public static int leftDigit(String str) {

        //single quotes for 0

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= '0' && c <= '9') {
                return Character.getNumericValue(c);
            }
            //because 0-9 are the digits we are looking at here
            //use a for loop
            //use str.charAt()
        }
        return 0;
    }

}

/*
Write a function that takes a string as an argument and returns the left most digit in the string.
Examples
leftDigit("TrAdE2W1n95!") ➞ 2
leftDigit("V3r1ta$") ➞ 3
leftDigit("U//DertHe1nflu3nC3") ➞ 1
leftDigit("J@v@5cR1PT") ➞ 5
Notes
Each string will have at least two numbers.
Return the result as an integer.
 */


