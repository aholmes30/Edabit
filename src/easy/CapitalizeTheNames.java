package easy;

public class CapitalizeTheNames {

    public static String[] capMe(String[] s) {
        String[] caps = new String[s.length];
        for(int i = 0; i < s.length; i++){
            caps[i] = s[i].substring(0,1).toUpperCase() + s[i].substring(1).toLowerCase();
        }
        return caps;
    }

}

/*
Create a method that takes an array of names and returns an array where only the
first letter of each name is capitalized.
Examples
capMe(["mavis", "senaida", "letty"]) ➞ ["Mavis", "Senaida", "Letty"]
capMe(["samuel", "MABELLE", "letitia", "meridith"]) ➞ ["Samuel", "Mabelle", "Letitia", "Meridith"]
capMe(["Slyvia", "Kristal", "Sharilyn", "Calista"]) ➞ ["Slyvia", "Kristal", "Sharilyn", "Calista"]
Notes
Don't change the order of the original array.
Notice in the second example above, "MABELLE" is returned as "Mabelle".
 */
