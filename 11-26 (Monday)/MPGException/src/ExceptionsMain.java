import java.util.*;

public class ExceptionsMain 
{
	public static int milesPerGallon(int miles, int gallons)
		throws ArithmeticException
	{
		return miles/gallons;
	}
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		boolean continueLoop = true;
		int miles, gallons, mpg;
		
		do 
		{
			try
			{
				System.out.println("Please enter an integer for number of miles driven: ");
				miles = input.nextInt();
				
				System.out.println("Please enter an integer for the gallons of gas used: ");
				gallons = input.nextInt();
				
				mpg = milesPerGallon(miles, gallons);
				System.out.printf("Your MPG is %d / %d = %d\n", miles, gallons, mpg);
				continueLoop = false;
			}
			catch (InputMismatchException inputMisMatch)
			{
				System.err.printf("\nException: %s\n", inputMisMatch);
				input.nextLine();
				System.out.println("You must enter a positive whole number. Pleae try again.\n");
			}
			catch (ArithmeticException arithmeticException)
			{
				System.err.printf("Exception: %s\n", arithmeticException);
				System.out.printf("Zero is an invalid entry for gallons. \nTry again.");
			}
			finally
			{
				System.out.println("End of catch.");
			}
		}
		while (continueLoop);
	}

}
