package easy;

public class FindTheBomb {

    public static String bomb(String str) {
        //method name: bomb
        //method type: 4 -> return data is String, params are String str

        String temp = str.toLowerCase();    //create temp String var and set it to lowercase using toLowerCaseMethod
        if(temp.contains("bomb") != true) {
            return "Relax, there's no bomb.";
        }
        else {
            return "DUCK!";
        }
    }

    public static void main(String[] args) {

        System.out.println(bomb("Hello I have a b omb"));
        System.out.println(bomb("Hello I have a bomb"));
    }
}

/*
Write a function that finds the word "bomb" in the given string.
Return "DUCK!" if found, otherwise,"Relax, there's no bomb.".

Examples
bomb("There is a bomb.") ➞ "DUCK!"
bomb("Hey, did you think there is a BOMB?") ➞ "DUCK!"
bomb("This goes boom!!!") ➞ "Relax, there's no bomb."
Notes
The string "bomb" may appear in different character cases (i.e. uppercase, lowercase, mixed).
 */
