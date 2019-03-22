import java.util.Scanner;

public class OverloadingMain 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int iNumber;
		double dNumber;
		
		System.out.println("Enter an integer: ");
		iNumber = input.nextInt();
		
		while (iNumber < 0)
		{
			System.out.println("Incorrect entry. \nPlease try again.");
			iNumber = input.nextInt();
		}
		
		System.out.println("That number's square is: " + MyMath.square(iNumber));
		
		System.out.println("Enter a double: ");
		dNumber = input.nextDouble();

		while (dNumber < 0)
		{
			System.out.println("Incorrect entry. \nPlease try again.");
			dNumber = input.nextDouble();
		}
		
		System.out.println("That number's square is: " + MyMath.square(dNumber));
	}

}
