package veryEasy;

public class FindTheTotalNumberOfDigitsTheGivenNumberHas {

    public static int findDigitAmount(int num) {
        //method type: 4 --> return data is int, params are int
        //method name: findDigitAmount

        int count = 0;
        if (num == 0) { //add this if statement to make sure 0 is counted as 1
            return 1;
        }
        while (num > 0) {
            num = num / 10;
            count = count + 1;
        }
        return count;

    }

}

/*
Create a function that takes a number as an argument and returns the amount of digits it has.
Examples
findDigitAmount(123) ➞ 3
findDigitAmount(56) ➞ 2
findDigitAmount(7154) ➞ 4
findDigitAmount(61217311514) ➞ 11
findDigitAmount(0) ➞ 1
 */