import java.util.Scanner;

public class LargestClass
{
	public void determineLargest()
	{
		Scanner input = new Scanner(System.in);
		int largest, number,counter;
		
		System.out.println("How many number do you want to check?");
		counter = input.nextInt();
		
		while (counter <= 0)
		{
			System.out.println("Enter a number greater than zero: ");
			counter = input.nextInt();
		}
		
		System.out.println("Enter a number greater than zero and less than 100:");
		number = input.nextInt();
		
		while (number < 1 || number > 100)
		{
			System.out.println("Incorrect entry, Please try again.");
			number = input.nextInt();
		}
		
		largest = number;
		for (int i = 2; i <= counter; i++)
		{
			System.out.println("Enter a number greater than zero and less than 100:");
			number = input.nextInt();
			
			while (number < 1 || number > 100)
			{
				System.out.println("Incorrect entry, Please try again.");
				number = input.nextInt();
			}
			if (number > largest)
				largest = number;
		} // End of For Loop
		System.out.println("The largest number is: " + largest);
	}
}
