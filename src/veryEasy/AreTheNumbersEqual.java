package veryEasy;

public class AreTheNumbersEqual {

        public static boolean isSameNum(int x, int y) {

            if(x == y) {
                return true;
            }
            return false;
        }


        public static void main(String[] args) {

            System.out.println(isSameNum(2, 5));
            System.out.println(isSameNum(15,15));

    }
}






//Create a function that returns true when x is equal to y; otherwise return false.
//
//Examples
//isSameNum(4, 8) ➞ false
//
//isSameNum(2, 2) ➞  true
//
//isSameNum(42, 32) ➞  false
