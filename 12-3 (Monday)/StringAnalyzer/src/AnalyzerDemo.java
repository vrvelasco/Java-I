import java.util.Scanner;

public class AnalyzerDemo 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String str = "";
		char[] array;
		int letters = 0, digits = 0,whiteSpaces = 0, vowels = 0, consonant = 0;
		
		System.out.println("Enter a string: ");
		str = input.nextLine();
		
		while (str.length() <= 0) 
		{
			System.out.println("You must enter at least one letter or number.");
			str = input.nextLine();
		}
		
		str = str.toLowerCase();
		array = str.toCharArray();
		for (int i = 0; i < array.length; i++)
		{
			if (Character.isLetter(array[i]))
			{
				letters++;
				
				if (array[i] == 'a')
					vowels++;
				else if (array[i] == 'e')
					vowels++;
				else if (array[i] == 'i')
					vowels++;
				else if (array[i] == 'o')
					vowels++;	
				else if (array[i] == 'u')
					vowels++;
				else
					consonant++;
			}
			else if (Character.isDigit(array[i]))
			digits++;		
			else if (Character.isWhitespace(array[i]))
			whiteSpaces++;
		}
		
		System.out.println("That string contains: \n" + letters + " letters\n" + digits + " digits \n" + whiteSpaces + " white spaces \n " + vowels + " vowels and\n" + consonant + " consonants.");
	
	input.close();
	}

}
