package veryEasy;

public class CharacterInShapes {

    public static int countCharacters(String[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i].length();
        }
        return sum;
    }


}

/*
Create a function to calculate how many characters in total are needed to make
up the shape. You will be given an array of strings which make up a shape in
the compiler (i.e. a square, a rectangle or a line).

Examples
countCharacters([
  "###",
  "###",
  "###"
]) ➞ 9
countCharacters([
  "22222222",
  "22222222",
]) ➞ 16
countCharacters([
  "------------------"
]) ➞ 18
countCharacters([]) ➞ 0
countCharacters(["", ""]) ➞ 0
Notes
Return 0 if the given array is empty.
 */
