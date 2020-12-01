package easy;

public class CaptureTheRook {

    public static boolean canCapture(String[] rooks) {
        //method name: canCapture
        //method type: 4 --> return data is boolean, params are String[] rooks

        //Two rooks can attack each other if they share the same row (letter)
        //or column (number).

        String rook1 = rooks[0]; //take
        String rook2 = rooks[1];

        return rook1.charAt(0) == rook2.charAt(0) || rook1.charAt(1) == rook2.charAt(1);
    }
}


/*
Write a function that returns true if two rooks can attack each other, and false otherwise.

Examples
canCapture(["A8", "E8"]) ➞ true
canCapture(["A1", "B2"]) ➞ false
canCapture(["H4", "H3"]) ➞ true
canCapture(["F5", "C8"]) ➞ false
Notes
Assume no blocking pieces.
Two rooks can attack each other if they share the same row (letter) or column (number).
 */
