package medium;

public class CountDuplicates {

    public static int duplicates(String str){

        int countDuplicate = 0;    //set and int variable to 0 to count and keep track of duplicates

        for(int i = 0; i < str.length()-1; i++) {  //use a for loop to go through string to count first char
            for(int j = i + 1; j < str.length(); j++) { //use another for loop to go through and compare first char to second
                if(str.charAt(i) == str.charAt(j)){  //second for loop will not stop until it finds a duplicate from first loop
                    countDuplicate++;
                    break; //need a break statement because we are only counting if the char appears twice and that is it
                }
            }
        }
         return countDuplicate;

    }
    public static void main(String[] args) {
                                         //01234
        System.out.println(duplicates("ninja"));
        //                                n  i  n  j a
        //                                0  1  2  3 4


    }
}

/*
Create a function that returns the amount of duplicate characters
in a string. It will be case sensitive and spaces are included.
If there are no duplicates, return 0.
Examples
duplicates("Hello World!") ➞ 3
// "o" = 2, "l" = 3.
// "o" is duplicated 1 extra time and "l" is duplicated 2 extra times.
// Hence 1 + 2 = 3
duplicates("foobar") ➞ 1
duplicates("helicopter") ➞ 1
duplicates("birthday") ➞ 0
// If there are no duplicates, return 0
Notes
Make sure to only start counting the second time a character appears.

 */
