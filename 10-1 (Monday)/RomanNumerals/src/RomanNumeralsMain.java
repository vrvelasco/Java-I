import java.util.Scanner;

public class RomanNumeralsMain 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int number;
		char repeat;
		
		do {
		System.out.println("Enter a number between 1 and 10.");
		number = input.nextInt();
		
		while (number <= 0 || number > 10)
		{
			System.out.println("Incorrect entry. Enter a number between 1 and 10.");
			number = input.nextInt();
		}
		
		switch (number) 
		{
		case 1: 
			System.out.println("I");
			break;
		case 2: 
			System.out.println("II");
			break;
		case 3: 
			System.out.println("III");
			break;
		case 4:
			System.out.println("IV");
			break;
		case 5:
			System.out.println("V");
			break;
		case 6:
			System.out.println("VI");
			break;
		case 7:
			System.out.println("VII");
			break;
		case 8:
			System.out.println("VIII");
			break;
		case 9:
			System.out.println("IX");
			break;
		case 10: 
			System.out.println("X");
			break;
		default:
				System.out.println("Incorrect entry.");
		} // End of switch (number)
		
		input.nextLine();
		
		System.out.println("Enter Y to continue\nEnter N to exit");
		String str = input.nextLine();
		repeat = str.charAt(0);
		
	}while (repeat == 'Y' || repeat == 'y'); // End of do while.
		
		input.close();
  } // End of main
}// End of class
