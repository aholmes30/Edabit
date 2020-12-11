package easy;

public class ValidZipCode {

    public static boolean isValid(String zip) {
        if (zip.length() != 5) return false;

        for(int i=0; i<zip.length(); i++) {
            if(!Character.isDigit(zip.charAt(i)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isValid("5432632"));
        System.out.println(isValid("45678"));
    }
}

/*
Zip codes consist of 5 consecutive digits. Given a string, write a function to
determine whether the input is a valid zip code. A valid zip code is as follows:
Must only contain numbers (no non-digits allowed).
Must not contain any spaces.
Must not be greater than 5 digits in length.
Examples
isValid("59001") ➞ true
isValid("853a7") ➞ false
isValid("732 32") ➞ false
isValid("393939") ➞ false
 */
