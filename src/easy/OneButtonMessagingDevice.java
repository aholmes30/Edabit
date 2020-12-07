package easy;

public class OneButtonMessagingDevice {
    public static int howManyTimes(String msg) {
        int c = 0;
        for(int i = 0; i < msg.length(); i++)
            c = c + (int) msg.charAt(i) - 96;
        return c;
    }

}

/*
Imagine a messaging device with only one button. For the letter A,
you press the button one time, for E, you press it five times, for G,
it's pressed seven times, etc, etc.

Write a function that takes a string (the message) and returns the total number of times the button is pressed.
Examples
howManyTimes("abde") ➞ 12
howManyTimes("azy") ➞ 52
howManyTimes("qudusayo") ➞ 123
Notes
Ignore spaces.
The given string argument will be in lower case.
 */
