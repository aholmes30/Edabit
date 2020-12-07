package easy;

public class FractionGreaterThanOne {

    public static boolean greaterThanOne(String frac) {
        String[] f = frac.split("/");
        int a = Integer.parseInt(f[0]);
        int b = Integer.parseInt(f[1]);
        return a > b;
    }


}

/*
Given a fraction as a string, return whether or not it is greater than 1 when evaluated.
Examples
greaterThanOne("1/2") ➞ false
greaterThanOne("7/4") ➞ true
greaterThanOne("10/10") ➞ false
Notes
Fractions must be strictly greater than 1 (see example #3).
 */
