package easy;

public class RemoveTheLettersABC {
    public static String removeABC(String words) {

        if (words.contains("a") || words.contains("b") || words.contains("c")) {
            return words.replace("a", "").replace("b", "").replace("c", "");
        }
        return null;
    }
}



/*
Create a function that will remove the letters "a", "b" and "c" from the given
string and return the modified version. If the given string does not contain "a", "b", or "c", return null.
Examples
removeABC("Tesha is my world") ➞ "Tesh is my world"
removeABC("This might be a bit hard") ➞ "This might e  it hrd"
removeABC("hello world!") ➞ null
removeABC("") ➞ null
Notes
If the given string does not contain "a", "b", or "c", return null.

 */
