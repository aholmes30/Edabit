package veryEasy;

public class CalculateUsingStringOperation {

    public static int calculate(int num1, int num2, String operation) {
        if(operation=="*") {
            return num1*num2;
        }
        if(operation=="-") {
            return num1-num2;
        }
        if(operation=="+") {
            return num1+num2;
        }
        if(operation=="%") {
            return num1%num2;
        }
        if(operation=="/") {
            return num1/num2;
        }

        return 0;
    }

    public static void main(String[] args) {

        System.out.println(calculate(6, 36, "/"));


    }
}

/*
Create a function that takes two numbers and a mathematical operator and returns the result.
Examples
calculate(4, 9, "+") ➞ 13
calculate(12, 5, "-") ➞ 7
calculate(6, 3, "*") ➞ 18
calculate(25, 5, "/") ➞ 5
calculate(14, 3, "%") ➞ 2
Notes
Numbers can be negative.
The only operations used are those in the examples above.
 */
