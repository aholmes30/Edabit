package easy;

public class RemoveAllSpecialCharsFromAString {

    public static String removeSpecialCharacters(String s) {

        String result = s.replaceAll("[|!@#\\]\\[$%^&*().~<>'+={}?,`]", "");
        return result;

        //have to use \\ for [ and ]

    }

}

/*
Create a method that takes a string, removes all "special" characters
(e.g. ., !, @, #, $, %, ^, &, \, *, (, )) and returns the new string.
The only non-alphanumeric characters allowed are dashes -, underscores _ and spaces.

Examples
removeSpecialCharacters("The quick brown fox!") ➞ "The quick brown fox"
removeSpecialCharacters("%fd76$fd(-)6GvKlO.") ➞ "fd76fd-6GvKlO"
removeSpecialCharacters("D0n$c sed 0di0 du1") ➞ "D0nc sed 0di0 du1"
 */
