package easy;

public class StringOrInteger {


    public static String intOrString(Object var) {
        if(var instanceof String)
            return "str";
        else
            return "int";

    }

}

/*
Create a function that checks if the argument is an integer or a string.
Return "int" if it's an integer and "str" if it's a string.

Examples
intOrString(8) ➞ "int"
intOrString("Hello") ➞ "str"
intOrString(9843532) ➞ "int"
Notes
Input will either be an integer or a string.
 */
