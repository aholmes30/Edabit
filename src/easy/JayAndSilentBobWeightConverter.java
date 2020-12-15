package easy;

public class JayAndSilentBobWeightConverter {

    public static String jayAndBob(String w) {
        if(w.equals("half")){
            return "14 grams";
        }
        else if(w.equals("quarter")){
            return "7 grams";
        }
        else if(w.equals("eighth")){
            return "3.5 grams";
        }
        else if(w.equals("sixteenth")){
            return "1.75 grams";
        }
        return "";
    }

    public static void main(String[] args) {

        System.out.println(jayAndBob("half"));
        System.out.println(jayAndBob("sixteenth"));
    }

}

/*
Jay and Silent Bob have been given a fraction of an ounce but they only understand grams.
Convert a fraction passed as a string to grams with up to two decimal places. An ounce weighs 28 grams.
Examples
jayAndBob("half") ➞ "14 grams"
jayAndBob("quarter") ➞ "7 grams"
jayAndBob("eighth") ➞ "3.5 grams"
Notes
Add the string "grams" to the end with a space.
 */
