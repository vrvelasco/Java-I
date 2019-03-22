import java.util.Scanner;
import java.security.SecureRandom;


public class RandomArrayMain 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); // Scanner object
		SecureRandom ranNumber = new SecureRandom(); // Random number generator
		
		int userNum;
		int[] numArray = new int[10];
		
		// Generate the random numbers
		for (int i = 0; i < 10; i++)
		{
			numArray[i] = ranNumber.nextInt(100) + 1;
		}
		
		// Ask user for integer		
		System.out.println("Enter an integer greater than zero and less than 100: ");
		userNum = input.nextInt();
		
		// Check range
		while (userNum <= 0 || userNum >= 100)
		{
			System.out.println("\n########### Incorrect entry. Please try again. ###########"
					       + "\n\nThe integer should be greater than zero and less than 100: ");
	                              		
			userNum = input.nextInt();
		}
		
		// Display all of the numbers in the array that are larger than the number the user entered.
		displayGreaterThan(numArray, userNum);
		
		// Close input 
		input.close();
	}
	
	public static void displayGreaterThan(int[] numArray, int userNum)
	{
		/*
		 * 
		 * I did some extra formatting to make the display look nice.
		 *  
		 */
		
		int greaterCount = 0;
		int numDisplay = 0;
		int[] greater = new int[10];
		
		// Output
		System.out.print("\n\nThe array contains these 10 random numbers: [ ");
		
		// Enhanced for loop
		for (int num : numArray)
		{
			System.out.print(num + " "); // I wanted to see the array numbers like in Visual Studio
			
			if (num > userNum)
			{
				greater[greaterCount] = num; // I will use this to display the greater numbers
				greaterCount++; // Keeping track of how many to display below
			}
		}
		
		// "Close" array formatting and add a line
		System.out.println("]\n");
		
		// How many numbers were there?
		System.out.print("RESULT: " + greaterCount + " number(s) greater than the number you entered. ");
	
		// Is the count 0?
		if (greaterCount != 0)
		{
			// Setup the final formatting
			System.out.print("Number(s): ( ");
				
			// Another enhanced for loop to display the numbers greater than
			for (int num : greater)
			{
				numDisplay++;
				
				if(numDisplay <= greaterCount)
				{
					System.out.print(num + " ");
				}
			}
			
			// Finally complete
			System.out.print(")");
		}
	}
}
