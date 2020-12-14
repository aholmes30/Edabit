package easy;

public class GetTheFileExtension {

    public static String[] getExtension(String[] arr) {
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i].substring(arr[i].indexOf('.') + 1);
        }
        return arr;
    }

}

/*
Write a function that maps files to their extension names.
Examples
getExtension(["code.html", "code.css"])
➞ ["html", "css"]

getExtension(["project1.jpg", "project1.pdf", "project1.mp3"])
➞ ["jpg", "pdf", "mp3"]

getExtension(["ruby.rb", "cplusplus.cpp", "python.py", "javascript.js"])
➞ ["rb", "cpp", "py", "js"]
Notes
N/A
 */
