package veryEasy;

public class CaseInsensitiveComparison {
    public static boolean match(String str1, String str2) {

        return str1.equalsIgnoreCase(str2);

    }

    public static void main(String[] args) {

        String one = "wOrld";
        String two = "hELLO";
        System.out.println(match(one, two));

        String oneAgain = "HELLO";
        String twoAgain = "hello";
        System.out.println(match(oneAgain, twoAgain));
    }


}

/*
Write a function that validates whether two strings are identical. Make it case insensitive.
Examples
match("hello", "hELLo") ➞ true
match("motive", "emotive") ➞ false
match("venom", "VENOM") ➞ true
match("mask", "mAskinG") ➞ false
 */
