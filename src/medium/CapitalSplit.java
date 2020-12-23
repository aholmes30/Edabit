package medium;

public class CapitalSplit {

    public static String capSpace(String txt) {
        String a = "";
        for(int i = 0; i < txt.length(); i++) {
            a += Character.isUpperCase(txt.charAt(i)) ? " " + Character.toLowerCase(txt.charAt(i)): Character.toLowerCase(txt.charAt(i));
        }
        return a;
    }


}

/*
Create a function which adds spaces before every capital in a word. Uncapitalize the whole string afterwards.
Examples
capSpace("helloWorld") ➞ "hello world"
capSpace("iLoveMyTeapot") ➞ "i love my teapot"
capSpace("stayIndoors") ➞ "stay indoors"
Notes
The first letter will stay uncapitalized.
 */