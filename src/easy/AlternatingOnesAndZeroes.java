package easy;

public class AlternatingOnesAndZeroes {

    public static boolean canAlternate(String str) {
        int one = 0,zero = 0;
        for(char c : str.toCharArray()){
            if (c=='1')
                one++;
            if (c=='0')
                zero++;
        }
        return (Math.abs(one-zero)<=1);
    }
}



/*
Write a function that returns true if the binary string can be rearranged to form a string of alternating 0s and 1s.
Examples
canAlternate("0001111") ➞ true
// Can make: "1010101"
canAlternate("01001") ➞ true
// Can make: "01010"
canAlternate("010001") ➞ false
canAlternate("1111") ➞ false
Notes
No substring of the output may contain more than one consecutive repeating character (e.g. 00 or 11 are not allowed).
Return false if a string only contains 0s or only contains 1s.
 */