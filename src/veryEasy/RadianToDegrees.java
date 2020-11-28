package veryEasy;

public class RadianToDegrees {

    public static double to_degree(double num) {
        return num * 180 / Math.PI;
    }
}

/*
Create a function that takes an angle in radians and converts it into degrees.

Examples
toDegree(Math.PI) ➞ 180
toDegree(Math.PI/2) ➞ 90
toDegree(Math.PI/4) ➞ 45
Notes
The input angles are in radians.
You will need to decide the data types for the input and output of the function.
Check out the Resources tab.
There are 360 degrees and 2 pi radians in a circle. So to convert degrees to radians,
divide by 360 and multiply by 2 * pi (approx. 6.28). Or equivalently, divide by 180 and multiply by pi.
Try not to use the built-in method Math.toDegrees().
 */
