package medium;

public class ReverseTheCase {

    public static String reverseCase(String str) {
        //return data: String
        // param: String str

        char[] chars = str.toCharArray();		//create char array from String

        for(int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {

        System.out.println(reverseCase("heLLo"));
    }

}

/*
Given a string, create a function to reverse the case. All lower-cased letters should be upper-cased, and vice versa.

Examples
reverseCase("Happy Birthday") ➞ "hAPPY bIRTHDAY"
reverseCase("MANY THANKS") ➞ "many thanks"
reverseCase("sPoNtAnEoUs") ➞ "SpOnTaNeOuS"
 */

