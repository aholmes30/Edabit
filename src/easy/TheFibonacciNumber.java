package easy;

public class TheFibonacciNumber {

    public static int Fibonacci(int a) {
        //method name: Fibonacci
        //method type: 4, return data is int, param is int a

        int num1 = 0;
        int num2 = 0;
        int sum = 1;   //total of all the values we added together

        for(int i = 0; i < a; i++) {
            num1 = num2;
            num2 = sum;
            sum = num1 + num2;

        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(Fibonacci(2));
    }
}

/*
Create a function that, given a number, returns the corresponding value of that index in the Fibonacci series.
The Fibonacci Sequence is the series of numbers:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
The next number is found by adding the two numbers before it:
The 2 is found by adding the two numbers before it (1+1).
The 3 is found by adding the two numbers before it (1+2).
The 5 is (2+3), and so on!
Examples
Fibonacci(3) ➞ 3
Fibonacci(7) ➞ 21
Fibonacci(12) ➞ 233
Notes
The first number in the sequence starts at 1 (not 0).
 */
