package easy;

public class HowMuchIsTrue {

    public static int countTrue(boolean[] arr) {
        //method name: countTrue;
        //method type: 4 -> return data is int, params are boolean[] arr


        int trueCount = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == true)
                trueCount++;
        }
        if(arr.length == 0) {
            return 0;
        }
        return trueCount;
    }
}

/*
Create a function which returns the number of true values there are in an array.
Examples
countTrue([true, false, false, true, false]) ➞ 2
countTrue([false, false, false, false]) ➞ 0
countTrue([]) ➞ 0
Notes
Return 0 if given an empty array.
All array items are of the type bool (true or false).
 */
