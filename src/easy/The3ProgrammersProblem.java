package easy;

import java.util.Arrays;
public class The3ProgrammersProblem {

        public static int programmers(int one, int two, int three) {

            int [] arr =  {one, two, three}; //create new array called arr and put ints inside of it
            Arrays.sort(arr);               //sort the array with Arrrays.sort method
            return arr[2] - arr[0];        //return the highest int minus the lowest
        }
}

/*
You hired three programmers and you (hopefully) pay them. Create a function
that takes three numbers (the hourly wages of each programmer) and returns
the difference between the highest-paid programmer and the lowest-paid.

Examples
programmers(147, 33, 526) ➞ 493
programmers(33, 72, 74) ➞ 41
programmers(1, 5, 9) ➞ 8
 */