package veryEasy;

public class HotPicsOfDannyDeVito {

    public static String preventDistractions(String args) {
        String result;
        if (args.contains("anime") || args.contains("meme") || args.contains("vine") || args.contains("roasts") || args.contains("Danny DeVito"))
            result = "NO!";
        else
            result = "Safe watching!";

        return result;
    }

}

/*
I'm trying to watch some lectures to study for my next exam but I keep getting
distracted by meme compilations, vine compilations, anime, and more on my favorite video platform.

Your job is to help me create a function that takes a string and checks to see if
it contains the following words or phrases:

"anime"
"meme"
"vines"
"roasts"
"Danny DeVito"
If it does, return "NO!". Otherwise, return "Safe watching!".

Examples
preventDistractions("vines that butter my eggroll") ➞ "NO!"

preventDistractions("Hot pictures of Danny DeVito") ➞ "NO!"

preventDistractions("How to ace BC Calculus in 5 Easy Steps") ➞ "Safe watching!"
 */
