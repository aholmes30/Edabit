package veryEasy;

public class FindThePerimeterOfARectangle {

    public static int findPerimeter(int length, int width) {

        return (length + width) * 2;

        //perimeter of rectangle: (length + width) * 2

    }

    public static void main(String[] args) {

        System.out.println(findPerimeter(13, 45));
    }
}







/*
Create a function that takes length and width and finds the perimeter of a rectangle.
Examples
findPerimeter(6, 7) ➞ 26
findPerimeter(20, 10) ➞ 60
find perimeter(2, 9) ➞ 22
 */
