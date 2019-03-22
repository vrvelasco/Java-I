import java.util.Scanner;
public class InputMain
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String name;
		double income, weeklyPay, monthlyPay;
		final int NUM_WEEKS = 52; // Constant
		final int NUM_MONTHS = 12;
		
		System.out.println("Enter 1 for weekly pay\nEnter 2 for monthly pay\nEnter 3 for annual pay\n");
		int choice = input.nextInt();
		
		System.out.println("Please enter your annual income: ");
		income = input.nextDouble();
		
		input.nextLine(); // Allows name to show
		
		System.out.println("Please enter your name: ");
		name = input.nextLine();
		
		// The Math
		weeklyPay = income / NUM_WEEKS;
		monthlyPay = income/NUM_MONTHS;
		
		// Display pay
		if (choice == 1)
		{
		System.out.printf("Hello %s\nYour weekly pay is $%,.2f\n", name, weeklyPay);
		}
		else if (choice == 2)
		{
		System.out.printf("Hello %s\nYour monthly pay is $%,.2f\n", name, monthlyPay);
		}
		else //if (choice == 3)
		{
		System.out.printf("Hello %s\nYour annual pay is $%,.2f\n", name, income);
		}
		input.close();
	}
		
	}


