package veryEasy;

public class HelloHelloWorldWorld {
    public static String helloWorld(int num) {

    String result = "";
		if(num%15==0)
    {
        result = "Hello World";
    }
		else if(num%5==0)
    {
        result = "World";
    }
		else if(num%3==0)
    {
        result = "Hello";
    }

		return result;
}

    public static void main(String[] args) {
        int num = 3;
        System.out.println(helloWorld(num));
    }


}

/*
Write a function that takes an integer and:
If the number is a multiple of 3, return "Hello".
If the number is a multiple of 5, return "World".
If the number is a multiple of both 3 and 5, return "Hello World".
Examples
helloWorld(3) ➞ "Hello"
helloWorld(5) ➞ "World"

helloWorld(15) ➞ "Hello World"
Notes
Don't forget to return the result.
 */