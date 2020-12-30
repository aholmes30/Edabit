package veryEasy;

public class CalculateDeterminantOfA2x2Matrix {
    public static int calcDeterminant(int[][] matrix) {
        return (matrix[0][0]*matrix[1][1])-(matrix[0][1]*matrix[1][0]);
    }

}

/*

 */

/*
Create a function to calculate the determinant of a 2 * 2 matrix.
The determinant of the following matrix is: ad - bc:
[[a, b], [c, d]]
Examples
calcDeterminant([
  [1, 2],
  [3, 4]
]) ➞ -2
calcDeterminant([
  [5, 3],
  [3, 1]
]) ➞ -4
calcDeterminant([
  [1, 1],
  [1, 1]
]) ➞ 0
Notes
Matrix will be in 2 * 2 form only.
 */
