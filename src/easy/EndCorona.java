package easy;

public class EndCorona {

    public static int endCorona(int recovers, int newCases, int activeCases) {
        int dif = recovers-newCases;
        double res = Math.ceil((double)activeCases/dif);
        int r = (int)res;
        return r;
    }

}

/*
Given the number of people that recover per day recovers, the number of new cases per
day newCases, and the number of currently active cases activeCases,
write a function to calculate the number of days needed to reach zero active cases.
Examples
endCorona(4000, 2000, 77000) ➞ 39
endCorona(3000, 2000, 50699) ➞ 51
endCorona(30000, 25000, 390205) ➞ 79
Notes
The number of people who recover per day recovers will always be greater than daily newCases.
Be conservative and round up the number of days needed.
 */
