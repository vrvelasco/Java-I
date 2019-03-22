import java.util.Scanner;
import java.security.SecureRandom;
import java.security.KeyStore.Entry;

public class TutorMain 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		SecureRandom ranNum = new SecureRandom();
		
		int num1, num2, choice;
		
		displayMenu();
		choice = input.nextInt();
		
		while (choice != 5)
		{
			if (choice >= 1 && choice <= 4)
			{
				num1 = 1 + ranNum.nextInt(100);
				num2 =  1 + ranNum.nextInt(100);
				
				switch (choice)
				{
				case 1:
					addition(num1, num2, input);
					break;
				case 2:
					subtraction(num1, num2, input);
					break;
				case 3:
					multiplication(num1, num2, input);
					break;
				case 4:
					{
						choice = 1 + ranNum.nextInt(3);
				
						switch (choice)
						{
						case 1:
							addition(num1, num2, input);
							break;
						case 2:
							subtraction(num1, num2, input);
							break;
						case 3:
							multiplication(num1, num2, input);
							break;
						} // End of inner switch
					} // End of case 4
				} // End of outer switch
			} // End of if
			else
				System.out.println("Incorrect entry. Please try again.");
			
				displayMenu();
				choice = input.nextInt();
		} // End of while
		
		input.close();
		
	} // End of main
	
	public static void displayMenu()
	{
		System.out.println("Enter 1 for Addition: \nEnter 2 for Subtraction: "
		         + "\nEnter 3 for Mulitplication: \nEnter 4 for Random Problems: "
		         + "\nEnter 5 to Exit: \n");
	}
	
	public static void addition(int n1, int n2, Scanner input)
	{
		int answer, userNum, num1 = n1, num2 = n2;
		
		System.out.println(num1 + " + " + num2 + " = ");
		answer = num1 + num2;
		userNum = input.nextInt();
		
		if (userNum == answer)
		{
			System.out.println("Correct Answer! =)");
		}
		else
		{
			System.out.println("Incorrect Answer.");
		}
	} // End of addition
	
	public static void subtraction(int n1, int n2, Scanner input)
	{
		int answer, userNum, num1 = n1, num2 = n2;
		
		System.out.println(num1 + " - " + num2 + " = ");
		answer = num1 - num2;
		userNum = input.nextInt();
		
		if (userNum == answer)
		{
			System.out.println("Correct Answer! =)");
		}
		else
		{
			System.out.println("Incorrect Answer.");
		}
	} // End of subtraction
	
	public static void multiplication(int n1, int n2, Scanner input)
	{
		int answer, userNum, num1 = n1, num2 = n2;
		
		System.out.println(num1 + " * " + num2 + " = ");
		answer = num1 * num2;
		userNum = input.nextInt();
	
		if (userNum == answer)
		{
			System.out.println("Correct Answer! =)");
		}
		else
		{
			System.out.println("Incorrect Answer.");
		}
	} // End of multiplication
}
