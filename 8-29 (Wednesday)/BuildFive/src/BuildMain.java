import java.util.Scanner;
public class BuildMain {

	public static void main(String[] args) {
		
		// Keyboard
		Scanner input = new Scanner(System.in);
	
		// Variables
		int number, digit1, digit2, digit3, digit4, digit5;
		
		// Get from user
			System.out.println("Enter the first digit: ");
			digit1 = input.nextInt();
			if (digit1 <= 0 || digit1 > 9)
			{
				System.out.println("Enter a number between 1-9.");
				digit1 = input.nextInt();
			}
				
			System.out.println("Enter the second digit: ");
			digit2 = input.nextInt();
			if (digit2 <= 0 || digit2 > 9)
			{
				System.out.println("Enter a number between 1-9.");
				digit2 = input.nextInt();
			}
			
			System.out.println("Enter the third digit: ");
			digit3 = input.nextInt();
			if (digit3 <= 0 || digit3 > 9)
			{
				System.out.println("Enter a number between 1-9.");
				digit3 = input.nextInt();
			}
			
			System.out.println("Enter the fourth digit: ");
			digit4 = input.nextInt();
			if (digit4 <= 0 || digit4 > 9)
			{
				System.out.println("Enter a number between 1-9.");
				digit4 = input.nextInt();
			}
			
			
			System.out.println("Enter the fifth digit: ");
			digit5 = input.nextInt();
			if (digit5 <= 0 || digit5 > 9)
			{
				System.out.println("Enter a number between 1-9.");
				digit5 = input.nextInt();
			}
						
			// Setup number
			number = digit1 * 10000;
			number += digit2 * 1000;
			number += digit3 * 100;
			number += digit4 * 10;
			number += digit5;
			System.out.println("The number is: " + number);
			input.close();
	}
}
