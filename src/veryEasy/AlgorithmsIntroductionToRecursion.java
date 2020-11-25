package veryEasy;

public class AlgorithmsIntroductionToRecursion {
    public static int factorial(int num) {

        if(num == 0) return 1;
        return num*factorial(num-1);

    }
}

/*
Instructions
The recursive function for this challenge should return the factorial of an
inputted integer. If anyone needs a refresher, factorials in mathematics
are represented by an exclamation point placed to the right of a number: 4! = 4 x 3 x 2 x 1 = 24

Examples
factorial(5) ➞ 120
factorial(3) ➞ 6
factorial(2) ➞ 2
 */
