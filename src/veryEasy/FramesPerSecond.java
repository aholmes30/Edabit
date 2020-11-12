package veryEasy;

public class FramesPerSecond {

    public static int frames(int min, int fps) {
        return min * 60 * fps;

    }

    public static void main(String[] args) {
        System.out.println(frames(45, 12));

    }
}

/*
Create a method that returns the number of frames shown in a given number of minutes for a certain FPS.
Examples
frames(1, 1) ➞ 60
frames(10, 1) ➞ 600
frames(10, 25) ➞ 15000
Notes
FPS stands for "frames per second" and it's the number of frames a computer screen shows every second.
 */
