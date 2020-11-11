package veryEasy;

public class PowerCalculator {

    public static int power(int voltage, int current) {

        return voltage * current;

    }

    public static void main(String[] args) {

        System.out.println(power(2, 18));
    }

}

/*
Create a function that takes voltage and current and returns the calculated power.
Examples
power(230, 10) ➞ 2300
power(110, 3) ➞ 330
power(480, 20) ➞ 9600
 */
