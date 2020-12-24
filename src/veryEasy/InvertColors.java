package veryEasy;

public class InvertColors {

    public static int[] invertColor(int[] rgb) {
        int[] ans = new int[]{255 - rgb[0], 255 - rgb[1], 255 - rgb[2] };
        return ans;
    }

    public static void main(String[] args) {

        int[] rgb = {0, 0 , 0};
        System.out.println(invertColor(rgb));
    }
}

/*
Create a function that inverts the rgb values in an array.

Examples
invertColor([255, 255, 255]) ➞ [0, 0, 0]
// [255, 255, 255] is the color white.
// The opposite is [0, 0, 0], which is black.

invertColor([12, 13, 200]) ➞ [243, 242, 55]
invertColor([12, 17, 197]) ➞ [243, 238, 58]
invertColor([243, 242, 235]) ➞ [12, 13, 20]
invertColor([0, 0, 0]) ➞ [255, 255, 255]
invertColor([165, 170, 221]) ➞ [90, 85, 34]
Notes
255 is the max value of a single color channel.
 */
