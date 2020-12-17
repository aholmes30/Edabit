package easy;

public class MatchTheLastItem {

    public static boolean matchLastItem(String[] t) {

        String test = "";
        for(int i = 0; i < t.length - 1; i++){
            test += t[i];
        }

        return test.equals(t[t.length - 1]);
    }

}

/*
Create a function that takes an array of items and checks if the last item matches
the rest of the array concatenated together.
Examples
matchLastItem(["i", "love", "tesh", "ilovetesh"]) ➞ true
// The last item is the rest joined.
 *
matchLastItem(["i", "am", "into", "her", "world", "iamintoherworld"]) ➞ true
// The last item is the rest joined.
matchLastItem(["1", "1", "1", "11"]) ➞ false
// The last item should be "111".
matchLastItem(["12", "13", "17", "19", "20", "40", "121317192040"]) ➞ true
Notes
The array is always filled with items.
 */
