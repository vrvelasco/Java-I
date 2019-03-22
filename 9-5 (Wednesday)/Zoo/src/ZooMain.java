import java.util.Scanner;

public class ZooMain 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		// Variables
		int qnty = 0, choice;
		double price = 0, subtotal = 0, totalCost = 0;
		final double TAX_RATE = 0.0925;
		
		// Menu
		System.out.println("Enter 1 for the Children's Zoo: ");
		System.out.println("Enter 2 for the Train: ");
		System.out.println("Enter 3 for the Sea Lion Show: ");
		System.out.println("Enter 4 for the Butterfly House: ");
		System.out.println("Enter 5 to exit: ");
		choice = input.nextInt();
		
		// Loop
		while (choice != 5)
		{
			if (choice > 0 && choice < 5)
			{	
				System.out.println("How many tickets?");
				qnty = input.nextInt();
				
				while (qnty <= 0)
				{
					System.out.println("Incorrect entry, quantity must be greater than zero.");
					qnty = input.nextInt();
				}
				if(choice == 1)
				{
					price = 9.99;
				}
				else if(choice == 2)
				{
					price = 4.99;
				}
				else if(choice == 3)
				{
					price = 14.99;
				}
				else if(choice == 4)
				{
					price = 19.99;
				}
			} //  End if (choice > 0 && choice < 5)
			else
				System.out.println("Incorrect entry, please try again.");
				
				// Calculate
				subtotal += qnty * price;
			
				// Show menu again
				System.out.println("Enter 1 for the Children's Zoo: ");
				System.out.println("Enter 2 for the Train: ");
				System.out.println("Enter 3 for the Sea Lion Show: ");
				System.out.println("Enter 4 for the Butterfly House: ");
				System.out.println("Enter 5 to exit: ");
				choice = input.nextInt();
			
		}  // End while (choice != 5)
		
		totalCost = (subtotal) + (subtotal * TAX_RATE);
		System.out.printf("Your total cost is: $%,.2f\n", totalCost);
		// Close input
		input.close();
	}

}
