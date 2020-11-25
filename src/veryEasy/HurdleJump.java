package veryEasy;

public class HurdleJump {
    public static boolean hurdleJump(int[] hurdles, int h) {
    //method name: hurdleJump
    //method type: 4 ->return type is boolean, params are int[] hurdles, int h
    //use a loop

	for(int i = 0; i < hurdles.length; i++)
            if(hurdles[i] < h) {
        return true;
    }
	if(hurdles.length == 0) {
        return true;
    }
			return false;
}

}


/*
Create a function that takes an array of hurdle heights and a jumper's jump height,
and determine whether or not the hurdler can clear all the hurdles.

A hurdler can clear a hurdle if their jump height is greater than or equal to the hurdle height.
Examples
hurdleJump([1, 2, 3, 4, 5], 5) ➞ true
hurdleJump([5, 5, 3, 4, 5], 3) ➞ false
hurdleJump([5, 4, 5, 6], 10) ➞ true
hurdleJump([1, 2, 1], 1) ➞ false
Notes
Return true for the edge case of an empty array of hurdles. (Zero hurdles means that any jump height can clear them).
 */