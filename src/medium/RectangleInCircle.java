package medium;

public class RectangleInCircle {

    public static boolean rectangleInCircle(int w, int h, int r) {
        return (w*w+h*h) < (4*r*r);
    }

    public static void main(String[] args) {

        System.out.println(rectangleInCircle(5, 6, 3));
    }


}

/*
Create a function that takes three numbers — the width and height of a rectangle,
and the radius of a circle and returns true if the rectangle can fit inside the circle, false if it can't.
Examples
rectangleInCircle(8, 6, 5) ➞ true
rectangleInCircle(5, 9, 5) ➞ false
rectangleInCircle(4, 7, 4) ➞ false
 */
