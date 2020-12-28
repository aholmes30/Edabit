package easy;

public class SolveExponentialEquationsWithLogarithms {


    public static int solveForExp(int a, int b) {

        int c = 0;
        for(int x = 0; c==0; x++)
            if (b == Math.pow(a, x))
                return x;
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(solveForExp(4, 1024));
    }

}

/*
Create a function that takes a number a and finds the missing exponent x
so that a when raised to the power of x is equal to b.

Examples
solveForExp(4, 1024) ➞ 5
solveForExp(2, 1024) ➞ 10
solveForExp(9, 3486784401) ➞ 10
Notes
a is raised to the power of what in order to equal b?
 */
