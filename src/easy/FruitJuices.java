package easy;

import org.w3c.dom.ls.LSOutput;

public class FruitJuices {

    public static String getDrinkID(String flavor, String ml) {
        String[] strArr= flavor.split(" ");
        String newStr="";
        for(String s :strArr){
            newStr+= s.toUpperCase().substring(0,3);
        }
        return newStr+ml.replaceAll("ml","");
    }


    public static void main(String[] args) {
        System.out.println(getDrinkID("pineapple", "70ml"));
    }


}

/*
A fruit juice company tags their fruit juices by concatenating the first three
letters of the words in a flavor's name and its capacity.

Create a function that creates the product IDs for the variety of fruit juices.
Examples
getDrinkID("apple", "500ml") ➞ "APP500"
getDrinkID("pineapple", "45ml") ➞ "PIN45"
getDrinkID("passion fruit", "750ml") ➞ "PASFRU750"
Notes
Capacity will be given as a string and will always be given in ml.
Return the product ID in UPPERCASE.
 */