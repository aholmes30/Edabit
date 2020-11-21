package veryEasy;

public class RecursionSum {

    public static int sum(int n) {
        //method name: int sum
        //method type: 4 --> return data is int, params is int n

        if (n >= 1) {
            return sum(n - 1) + n;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(sum(6));
    }
}

/*
Write a function that recursively finds the sum of the first n natural numbers.
Examples
sum(5) ➞ 15
// 1 + 2 + 3 + 4 + 5 = 15
sum(1) ➞ 1
sum(12) ➞ 78
Notes
Assume the input number is always positive.
 */