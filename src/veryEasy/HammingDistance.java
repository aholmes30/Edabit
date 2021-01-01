package veryEasy;

public class HammingDistance {

    public static int hammingDistance(String str1, String str2) {
        //method name: hammingDistance
        //method type: 4 -> returns int, params are str1 and str2
        //use a loop

        int i = 0; //initialize i
        int misMatchcount = 0; //set a count to 0
        while(i < str1.length()) {
            if(str1.charAt(i) != str2.charAt(i))
                misMatchcount++;
            i++;
        }
        return misMatchcount;
    }

    public static void main(String[] args) {

        System.out.println(hammingDistance("strong", "strung"));
    }
}



/*
Hamming distance is the number of characters that differ between two strings.

To illustrate:
String1: "abcbba"
String2: "abcbda"
Hamming Distance: 1 - "b" vs. "d" is the only difference.
Create a function that computes the hamming distance between two strings.
Examples
hammingDistance("abcde", "bcdef") ➞ 5
hammingDistance("abcde", "abcde") ➞ 0
hammingDistance("strong", "strung") ➞ 1
Notes
Both strings will have the same length.
 */