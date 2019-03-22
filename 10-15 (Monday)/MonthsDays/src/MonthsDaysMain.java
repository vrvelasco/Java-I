import java.util.Scanner;

public class MonthsDaysMain 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String[] months = {"January", "Februay", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.println("Enter the number of the month: ");
		int noMonth = input.nextInt();
		
		while (noMonth <= 0 || noMonth > 12)
		{
			System.out.println("Incorrect entry, enter a number between one and twelve: ");
			noMonth = input.nextInt();
		}
		
		int index = noMonth - 1;
		
		System.out.println(months[index] + " has " + days[index] + " days in it.");
		
		for (int i = 0; i < months.length; i++)
		{
			System.out.println(months[i] + " has " + days[i] + " days in it.");
		}
		
		for (String month : months) // Enhanced for loop
		{
			System.out.println(month); 
		}
		input.close();
	}

}
