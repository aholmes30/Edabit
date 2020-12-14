package easy;

public class ATMPINCodeValidation {

    public static boolean validatePIN(String s) {
        char[] ns=s.toCharArray();
        int count=0;
        for (int i=0; i<ns.length; i++){
            if(Character.isDigit(ns[i])){
                count++;
            }
        }
        if(count==4 || count==6){
            return true;
        }
        else{
            return false;
        }
    }
}

/*
ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything
but exactly 4 digits or exactly 6 digits. Your task is to create a method that
takes a string and returns true if the PIN is valid and false if it's not.
Examples
validatePIN("1234") ➞ true
validatePIN("12345") ➞ false
validatePIN("a234") ➞ false
validatePIN("") ➞ false
Notes
Some test cases contain special characters.
Empty strings must return false.
 */


