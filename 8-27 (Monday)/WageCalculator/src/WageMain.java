import java.util.Scanner;
public class WageMain 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
				double hourlyRate, hoursWorked, regPay, otPay, otHours, income;
				double otRate = 2.0;
				final int NUM_WEEKS = 52;
				int choice;
				
				System.out.println("Enter 1 for hourly employee\nEnter 2 for salaried employee: ");
				choice = input.nextInt();
				
				if (choice == 1)
				{
					System.out.println("Enter the employee's rate of pay: ");
					hourlyRate = input.nextDouble();
				
					System.out.println("Enter the hours worked: ");
					hoursWorked = input.nextDouble();
				
					if (hoursWorked > 40)
					{
					otHours = hoursWorked - 40;
					hoursWorked = 40;
				}
					else
					otHours = 0;
				
					// Math
					otPay = otHours * otRate * hourlyRate;
					regPay = hoursWorked * hourlyRate;
				
					// Display
					System.out.printf("Your Regular Pay is: $%,.2f\n", regPay);
					System.out.printf("Your Overtime Pay is: $%,.2f\n", otPay);
					System.out.printf("Your Total Weekly Pay is: $%,.2f\n", otPay + regPay);
				}
				
				else
				{
					System.out.println("Please enter the annual salary: ");
					income = input.nextDouble();
					double weeklyPay = income / NUM_WEEKS;
					System.out.printf("Your Total Weekly Pay is: $%,.2f\n", weeklyPay);
				}
					input.close();
				}

}
