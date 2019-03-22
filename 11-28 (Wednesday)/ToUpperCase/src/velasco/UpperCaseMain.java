package velasco;

import java.util.Scanner;

public class UpperCaseMain 
{

	public static void main(String[] args) 
	{
		String str, capInput;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a sentence: ");
		str = input.nextLine();
		
		capitalize(str);
		
	}
	
	public static void capitalize(String str)
	{
		String capInput = str.toUpperCase();
		System.out.println("Your string capitalized: " + capInput);
	}

}
