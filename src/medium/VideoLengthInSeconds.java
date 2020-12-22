package medium;

public class VideoLengthInSeconds {


    public static int minutesToSeconds(String tm) {
        String [] arr = tm.split(":");
        int minutes = Integer.parseInt(arr[0]);
        int seconds = Integer.parseInt(arr[1]);
        int answer = 0;
        if(seconds >= 60){
            return -1;
        }
        else {
            answer = minutes * 60 + seconds;
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(minutesToSeconds("16:05"));
    }

}

/*
You are given the length of a video in minutes. The format is mm:ss (e.g.: "02:54").
Create a function that takes the video length and return it in seconds.
Examples
minutesToSeconds("01:00") ➞ 60
minutesToSeconds("13:56") ➞ 836
minutesToSeconds("10:60") ➞ -1
Notes
The video length is given as a string.
If the number of seconds is 60 or over, return -1 (see example #3).
You may get a number of minutes over 99 (e.g. "121:49" is perfectly valid).
 */

