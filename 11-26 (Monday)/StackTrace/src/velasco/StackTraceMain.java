package velasco;

import java.util.Scanner;

public class StackTraceMain 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Calling myMethod...");
		myMethod();
		System.out.println("The main is done.");
	}
	
	public static void myMethod()
	{
		System.out.println("Calling produceError method...");
		produceError();
		System.out.println("myMethod is done.");
	}

	public static void produceError()
	{
		String str = "abc";
		System.out.println(str.charAt(3));
		System.out.println("produceError is done.");
	}
}
