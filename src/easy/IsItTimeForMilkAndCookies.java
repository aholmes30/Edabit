package easy;

import java.util.GregorianCalendar;

public class IsItTimeForMilkAndCookies {
        public static boolean timeForMilkAndCookies(GregorianCalendar date) {
            boolean answer = false;

            int month = date.get(GregorianCalendar.MONTH);
            int day = date.get(GregorianCalendar.DAY_OF_MONTH);

            if(month == 11 && day == 24) {
                answer = true;
            }

            return answer;
        }

}

/*
Christmas Eve is almost upon us, so naturally we need to prepare some milk and
cookies for Santa! Create a method that accepts a GregorianCalendar object and
returns true if it's Christmas Eve (December 24th) and false otherwise.
Examples
GregorianCalendar(2013, 11, 24) ➞ true
GregorianCalendar(2013, 0, 23) ➞ false
GregorianCalendar(3000, 11, 24) ➞ true
Notes
Dates are zero based (see resources).
All test cases contain valid dates.
 */
