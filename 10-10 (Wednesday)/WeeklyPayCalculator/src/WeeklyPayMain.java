import java.util.Scanner;
import java.text.DecimalFormat;

public class WeeklyPayMain
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		
		char choice;
		double hours, payRate, salary;
		
		choice = menu(input);
		
		while (choice != 'E')
		{
			switch (choice)
			{
				case 'H':
					System.out.println("Enter the number of hours worked: ");
					hours = input.nextDouble();
					
					while (hours <= 0)
					{
						System.out.println("Hours must be greater than zero.");
						hours = input.nextDouble();
					}
					
					System.out.println("Enter the rate of pay: ");
					payRate = input.nextDouble();
					
					while (payRate <= 0)
					{
						System.out.println("The rate of pay must be greater than zero.");
						payRate = input.nextDouble();
					}
					
					System.out.println("The weekly gross pay is $" +  dollar.format(Pay.getWeeklyPay(hours,payRate)));
					
					break;
					
				case 'S':
					System.out.println("Enter the annual salary: ");
					salary = input.nextDouble();
					
					while (salary <= 0)
					{
						System.out.println("Salary must be greater than zero.");
						salary = input.nextDouble();
					}
					
					System.out.println("The weekly gross pay is: " + dollar.format(Pay.getWeeklyPay(salary)));
					
					break;
					
					default:
						System.out.println("Incorrect entry, please try again.");
						
						break;
			}
			
			input.nextLine();
			
			choice = menu(input);
		}
		
	} // End of main
	
	public static char menu(Scanner input)
	{
		String str;
		char choice;
		
		System.out.println("Enter H for hourly employee: ");
		System.out.println("Enter S for salary employee: ");
		System.out.println("Enter E to exit: ");
		
		str = input.nextLine();
		str = str.toUpperCase();
		
		choice = str.charAt(0);
		
		return choice;
	}

}
