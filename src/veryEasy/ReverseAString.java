package veryEasy;

public class ReverseAString {

    public static String reverse(String str) {

        //what is string is null?
        if(str == null){
            return str;
        }

        //create temp string
        String temp = "";

        //use a for loop to iterate through string backwards
        for(int i = str.length()-1; i >= 0; i--){
            temp += str.charAt(i);
        }
         return temp;
    }

    public static void main(String[] args) {

        String str = "Hello World";

        System.out.println(reverse(str));
    }

}
