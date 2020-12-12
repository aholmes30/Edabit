package easy;

public class IsTheNumberSymmetrical {
    public static boolean isSymmetrical(int num) {
        String number = String.valueOf(num);
        int len = number.length();
        boolean symetric = true;
        for(int i=0; i<len/2; i++){
            if(number.charAt(i)!=number.charAt(len-1-i)){
                symetric = false;
                return symetric;
            }
        }
        return symetric;
    }

}

/*
Create a function that takes a number as an argument and returns true or
false depending on whether the number is symmetrical or not.
A number is symmetrical when it is the same as its reverse.

Examples
isSymmetrical(7227) ➞ true
isSymmetrical(12567) ➞ false
isSymmetrical(44444444) ➞ true
isSymmetrical(9939) ➞ false
isSymmetrical(1112111) ➞ true
 */
