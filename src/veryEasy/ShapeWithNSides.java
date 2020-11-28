package veryEasy;

public class ShapeWithNSides {

    public static String nSidedShape(int n) {
        //method name: nSideShape
        //method type: 4 -> return data is String, param is int n

        int number = n;
        String shapeSide = "";
        switch (number) {
            case 1:
                shapeSide = "circle";
                break;
            case 2:
                shapeSide = "semi-circle";
                break;
            case 3:
                shapeSide = "triangle";
                break;
            case 4:
                shapeSide = "square";
                break;
            case 5:
                shapeSide = "pentagon";
                break;
            case 6:
                shapeSide = "hexagon";
                break;
            case 7:
                shapeSide = "heptagon";
                break;
            case 8:
                shapeSide = "octagon";
                break;
            case 9:
                shapeSide = "nonagon";
                break;
            case 10:
                shapeSide = "decagon";
                break;
        }
        return shapeSide;
    }
}

/*
Create a function that takes a whole number as input and returns the shape
with that number's amount of sides. Here are the expected outputs to get from these inputs.

Inputs	Outputs
1	"circle"
2	"semi-circle"
3	"triangle"
4	"square"
5	"pentagon"
6	"hexagon"
7	"heptagon"
8	"octagon"
9	"nonagon"
10	"decagon"
Examples
nSidedShape(3) ➞ "triangle"
nSidedShape(1) ➞ "circle"
nSidedShape(9) ➞ "nonagon"
Notes
There won't be any tests with a number below 1 or greater than 10.
Return the output in lowercase.
The challenge is intended to be completed without conditionals (it would take too long)!
 */
