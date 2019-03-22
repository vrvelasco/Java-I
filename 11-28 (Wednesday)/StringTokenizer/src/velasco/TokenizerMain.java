package velasco;

import java.util.*;

public class TokenizerMain
{

	public static void main(String[] args) 
	{
		String str;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		str = input.nextLine();
		
		while (str.length() <= 0)
		{
			System.out.println("You must enter at least one character: ");
			str = input.nextLine();
		}
				
		wordCount(str);
		
		input.close();
	}

	public static void wordCount(String str)
	{
		StringTokenizer strToken = new StringTokenizer(str);
		
		int count = strToken.countTokens();
		System.out.println("There are " + count + " words in the string you entered.");
	}
}
