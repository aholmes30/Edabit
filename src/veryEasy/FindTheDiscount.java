package veryEasy;

public class FindTheDiscount {

    public static double discount(int price, int percentage) {
//method name: discount
//method type: 4 -> return data is double, param is int price and int percentage

        double priceTimesDiscount = (price * percentage);
        double finalDiscount = price - priceTimesDiscount / 100;
        return finalDiscount;


        //divide by 100 to round two decimal places

    }
}

/*
Create a function that takes two arguments: the final price and the discount
percentage as integers and returns the final price after the discount.

Alternative Text
Examples
discount(1500, 50) ➞ 750
discount(89, 20) ➞ 71.2
discount(100, 75) ➞ 25
Notes
Your answer should be rounded to two decimal places.
 */
