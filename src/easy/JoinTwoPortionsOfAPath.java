package easy;

public class JoinTwoPortionsOfAPath {

    public static String joinPath(String portion1, String portion2) {

        String replaceString = portion1.replaceAll("/", "");
        String replaceString2 = portion2.replaceAll("/", "");
        return replaceString + "/" + replaceString2;
    }
}

/*
Write a function that receives two portions of a path and joins them.
The portions will be joined with the "/" separator.
There could be only one separator and if it is not present it should be added.

Examples
joinPath("portion1", "portion2") ➞ "portion1/portion2"
joinPath("portion1/", "portion2") ➞ "portion1/portion2"
joinPath("portion1", "/portion2") ➞ "portion1/portion2"
joinPath("portion1/", "/portion2") ➞ "portion1/portion2"
Notes
Try not to solve this challenge using only if-else conditions.
 */
