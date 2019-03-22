import java.util.Scanner;

public class ParseIntMain 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String str;
		int number;
		
		System.out.println("Please enter a string and I will convert it to an integer: " );
		str = input.nextLine();
		
		System.out.println("The string you entered is: " + str);
		try
		{
			number = Integer.parseInt(str);
			System.out.println("The converted string is: " + number);
		}
		catch (NumberFormatException e)
		{
			System.out.println("Conversion error: " + e.getMessage());
		}

	}

}
