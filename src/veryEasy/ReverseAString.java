package veryEasy;

public class ReverseAString {

    public static String reverse(String str) {

        //what if string is null?
        if(str == null){
            return str;
        }

        if(str == "") {  //what if string is empty?
            return str;
        }

        //create temp string
        String temp = "";

        //use a for loop to iterate through string backwards
        for(int i = str.length()-1; i >= 0; i--){  //start at last element (str.length()-1) and i will have to be >= 0
            temp += str.charAt(i);  //temp = temp + str.charAt(i);
        }
         return temp;
    }

    public static void main(String[] args) {

        String str = "";

        System.out.println(reverse(str));
    }

}

//reverse("hello") --> olleh --> true
//reverse("nijat") --> nijat --> false
//reverse("") ---->              true?
//reverse(null) --->       return null
