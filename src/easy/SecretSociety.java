package easy;

import java.util.Arrays;

public class SecretSociety {

        public static String societyName(String[] friends) {
            String s = "";
            Arrays.sort(friends);

            for(int i=0; i<friends.length; i++)
            {
                s += friends[i].charAt(0);
            }
            return s;
        }

    public static void main(String[] args) {

            String[] friends = {"Adam", "Jessica", "Adrian", "Same"};
        System.out.println(societyName(friends));
    }
}

/*
A group of friends have decided to start a secret society. The name will be the first letter of
each of their names, sorted in alphabetical order.

Create a function that takes in an array of names and returns the name of the secret society.
Examples
societyName(["Adam", "Sarah", "Malcolm"]) ➞ "AMS"
societyName(["Harry", "Newt", "Luna", "Cho"]) ➞ "CHLN"
societyName(["Phoebe", "Chandler", "Rachel", "Ross", "Monica", "Joey"]) ➞ "CJMPRR"
Notes
The secret society's name should be entirely uppercased.
 */
