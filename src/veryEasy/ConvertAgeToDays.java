package veryEasy;

public class ConvertAgeToDays {

    public static int calcAge(int age) {
        //method name: calcAge
        //method type: 4 -> return data is int, param is int age

        return age*(365);

    }

    public static void main(String[] args) {

        System.out.println(calcAge(57));
    }
}

/*
Create a function that takes the age and return the age in days.
Examples
calcAge(65) ➞ 23725
calcAge(0) ➞ 0
calcAge(20) ➞ 7300
Notes
Use 365 days as the length of a year for this challenge.
Ignore leap years and days between last birthday and now.
Expect only positive integer inputs.
 */
