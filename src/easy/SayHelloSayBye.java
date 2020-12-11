package easy;

public class SayHelloSayBye {


    public static String sayHelloBye(String name, int num) {
        //method name: sayHelloBye
        //method type: 4 -> return data is String, params are String name, int num

        String name2 = name.substring(0,1).toUpperCase() + name.substring(1);
        if(num == 1) {
            return "Hello" + " " + name2;
        }
        return "Bye" + " " + name2;
    }

    public static void main(String[] args) {

        System.out.println(sayHelloBye("Anna", 1));
    }
}

/*
Write a function that takes a string name and a number num (either 0 or 1) and
return "Hello" + name if num is 1, otherwise return "Bye" + name.

Examples
sayHelloBye("alon", 1) ➞ "Hello Alon"
sayHelloBye("Tomi", 0) ➞ "Bye Tomi"
sayHelloBye("jose", 0) ➞ "Bye Jose"
Notes
The name you return must be capitalized.
 */
