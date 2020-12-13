package easy;

public class HowManyDecimalPlaces {

    public static int getDecimalPlaces(String num) {

        if(!(num.contains("."))){
            return 0;
        }

        int pointPos = num.indexOf('.')+1;

        return (num.length() - pointPos);

    }


}

/*
Create a function that returns the number of decimal places a number
(given as a string) has. Any zeros after the decimal point count towards
the number of decimal places.

Examples
getDecimalPlaces("43.20") ➞ 2
getDecimalPlaces("400") ➞ 0
getDecimalPlaces("3.1") ➞ 1
Notes
Return 0 if the number doesn't have any decimal places (see example #2).
 */
