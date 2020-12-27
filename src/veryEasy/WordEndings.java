package veryEasy;

public class WordEndings {

    public static String[] addEnding(String[] arr, String ending) {

        String result[] = arr.clone();
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] + ending;
        }

        return result;
    }

    public static void main(String[] args) {

        String[] arr = {"clever", "meek", "hurried", "nice"};
        String ending = "ly";
        System.out.println(addEnding(arr, ending));
    }


}

/*
Create a function that adds a string ending to each member in an array.
Examples
addEnding(["clever", "meek", "hurried", "nice"], "ly")
➞ ["cleverly", "meekly", "hurriedly", "nicely"]
addEnding(["new", "pander", "scoop"], "er")
➞ ["newer", "panderer", "scooper"]
addEnding(["bend", "sharpen", "mean"], "ing")
➞ ["bending", "sharpening", "meaning"]
 */
