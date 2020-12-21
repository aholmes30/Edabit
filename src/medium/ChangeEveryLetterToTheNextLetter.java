package medium;

public class ChangeEveryLetterToTheNextLetter {

        public static String move(String word) {
            //method name: move
            //method type: 4 -> return data is String, param is String word

            String result = "";

            for(int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);  //create char variable
                int num = ch;             //create int variable and set it to ch
                num++;                   //increment it by one
                result = result + (char)num;  //cast the char
            }
            return result;
        }


}

/*
Write a function that changes every letter to the next letter:

"a" becomes "b"
"b" becomes "c"
"d" becomes "e"
and so on ...
Examples
move("hello") ➞ "ifmmp"
move("bye") ➞ "czf"
move("welcome") ➞ "xfmdpnf"
Notes
There will be no z's in the tests.
 */
