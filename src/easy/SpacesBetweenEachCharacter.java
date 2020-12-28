package easy;

public class SpacesBetweenEachCharacter {

    public static String spaceMeOut(String str) {

        String result = "";

        for(int i = 0; i < str.length()-1; i++) {
            result = result + str.charAt(i) + " ";
        }
        return result + str.substring(str.length()-1);
    }

    public static void main(String[] args) {

        System.out.println(spaceMeOut("hello"));
    }
}

/*
Create a function that takes a string and returns a string with spaces in between all of the characters.
Examples
spaceMeOut("space") ➞ "s p a c e"
spaceMeOut("far out") ➞ "f a r  o u t"
spaceMeOut("elongated musk") ➞ "e l o n g a t e d   m u s k"
Notes
Treat a space as its own character (i.e. leave three spaces between words).
 */
