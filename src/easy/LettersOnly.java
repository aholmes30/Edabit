package easy;

public class LettersOnly {

    public static String lettersOnly(String str) {
        //return data String, param String str

        return str.replaceAll("[_;:|!@#\\]\\[$%^&*().\\-~<>'+={}?,`1234567890//]", "");

    }

    public static void main(String[] args) {

        System.out.println(lettersOnly("T*w56i#lig@h!t!!"));
    }
}

/*
Write a function that removes any non-letters from a string, returning a well-known film title.
Examples
lettersOnly("R!=:~0o0./c&}9k`60=y") ➞ "Rocky"
lettersOnly("^,]%4B|@56a![0{2m>b1&4i4") ➞ "Bambi"
lettersOnly("^U)6$22>8p).") ➞ "Up"
 */
