package veryEasy;

public class BasicCalculator {

    public static int calculator(int num1, char operator, int num2) {
        if( operator=='+')
            return num1+num2;
        else if( operator=='-')
        {
            return num1-num2;
        }
        else if( operator=='*')
            return num1*num2;
        else {
            if(num1==0 || num2==0)
                return 0;
            else
                return num1/num2 ;
        }
    }
}

/*
Create a function that takes two numbers and a mathematical operator + - / *
and will perform a calculation with the given numbers.

Examples
calculator(2, '+', 2) ➞ 4
calculator(2, '*', 2) ➞ 4
calculator(4, '/', 2) ➞ 2
Notes
If the input tries to divide by 0, return 0.
 */
