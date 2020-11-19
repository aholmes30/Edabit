package veryEasy;

public class HowManyDsAreThere {

    public static int countDs(String s) {
        int count = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'd' || s.charAt(i) == 'D') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String str = "Hi how are you today David?";

        System.out.println(countDs(str));

    }
}

/*
Create a function that counts how many D's are in a sentence.
Examples
countDs("My friend Dylan got distracted in school.") ➞ 4
countDs("Debris was scattered all over the yard.") ➞ 3
countDs("The rodents hibernated in their den.") ➞ 3
Notes
Your function must be case-insensitive.
 */
