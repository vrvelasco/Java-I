import java.util.Scanner;

public class UserSquaresMain 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int number, maxValue;
		
		System.out.println("I will display a table of numbers and their squares:");
		System.out.println("How high should I go? ");
		
		maxValue = input.nextInt();
		
		while (maxValue <= 0 || maxValue > 100)
		{
			System.out.println("Incorrect entry, enter a number between 1 and 100.");
			maxValue = input.nextInt();
		}
		
		System.out.println("Number    Number Squared");
		System.out.println("------------------------");
		
		for (number = 1; number <= maxValue; number++)
		{
			System.out.println(number + "\t\t" + number*number);
		}
				
		input.close();
	}

}
