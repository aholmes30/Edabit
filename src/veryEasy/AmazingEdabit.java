package veryEasy;

public class AmazingEdabit {

        public static String amazingEdabit(String str) {
            if (str.contains("edabit")){
                return str;
            }
            else return str.replace("amazing", "not amazing");
        }

    public static void main(String[] args) {

        System.out.println(amazingEdabit("Snow is amazing"));
    }
    }

    /*
    Create a function that takes a string and changes the word amazing to not amazing.
    Return the string without any change if the word edabit is part of the string.

Examples
amazingEdabit("edabit is amazing.") ➞ "edabit is amazing."

amazingEdabit("Mubashir is amazing.") ➞ "Mubashir is not amazing."

amazingEdabit("Infinity is amazing.") ➞ "Infinity is not amazing."
     */



