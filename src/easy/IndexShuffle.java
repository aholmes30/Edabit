package easy;

public class IndexShuffle {

    public static String indexShuffle(String str) {
        String a = "";
        String b = "";
        for(int i = 0; i < str.length(); i++) {
            if(i % 2 == 0) {
                a += str.charAt(i);
            }
            else
                b += str.charAt(i);
        }
        return a + b;
    }
}

/*
Write a function that takes all even-indexed characters and odd-indexed
characters from a string and concatenates them together.
To illustrate:
indexShuffle("abcd") ➞ "acbd"
// "ac" (even-indexed) + "bd" (odd-indexed)
Examples
indexShuffle("abcdefg") ➞ "acegbdf"
indexShuffle("holiday") ➞ "hldyoia"
indexShuffle("maybe") ➞ "myeab"
Notes
0 should be treated as an even number.
 */
