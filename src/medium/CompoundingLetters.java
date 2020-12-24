package medium;

public class CompoundingLetters {

    public static String accum(String str) {
    String result = "";  //create a string result to return later

		for(int i = 0; i < str.length(); i++) { //for loop to iterate through string
        result += Character.toUpperCase(str.charAt(i)); //call the Character class
        for(int j = 0; j < i; j++) { //nested loop to go through String and make sure j < i
            result += Character.toLowerCase(str.charAt(i));
        }
        if(i < str.length()-1) {
            result += "-";
        }
    }
		return result;
}

}

/*
Create a function that takes a string and returns a new string with each new
character accumulating by +1. Separate each set with a dash.
Examples
accum("abcd") ➞ "A-Bb-Ccc-Dddd"
accum("RqaEzty") ➞ "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") ➞ "C-Ww-Aaa-Tttt"
Notes
Capitalize the first letter of each set.
All tests contain valid strings with alphabetic characters (a-z, A-Z).
 */
