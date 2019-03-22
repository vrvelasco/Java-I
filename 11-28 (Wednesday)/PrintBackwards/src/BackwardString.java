import java.util.Scanner;

public class BackwardString 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String str;
		
		System.out.println("Enter a sentence: ");
		str = input.nextLine();
		
		while (str.length() < 0) // Something in the string
		{
			System.out.println("You must enter at least one character.");
			str = input.nextLine();
		}
		
		backward(str);
	
		input.close();
	}
	
	public static void backward(String str)
	{
		for (int i = str.length() - 1; i >= 0; i--) // Go through string backwards
		{
			System.out.print(str.charAt(i)); // Print index
		}
		
		System.out.println();
	}

}
