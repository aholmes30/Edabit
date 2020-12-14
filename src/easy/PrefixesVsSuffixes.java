package easy;

public class PrefixesVsSuffixes {

    public static boolean isPrefix(String word, String prefix) {
        return word.matches(prefix.replaceAll("-","") + ".*");
    }

    public static boolean isSuffix(String word, String suffix) {
        return word.matches(".*" + suffix.replaceAll("-",""));
    }

}

/*
Create two functions: isPrefix(word, prefix-) and isSuffix(word, -suffix).
isPrefix should return true if it begins with the prefix argument.
isSuffix should return true if it ends with the suffix argument.
Otherwise return false.
Examples
isPrefix("automation", "auto-") ➞ true
isSuffix("arachnophobia", "-phobia") ➞ true
isPrefix("retrospect", "sub-") ➞ false
isSuffix("vocation", "-logy") ➞ false
Notes
The prefix and suffix arguments have dashes - in them.
 */
