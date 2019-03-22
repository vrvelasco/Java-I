import java.util.Scanner;
public class IceCreamMain
{

	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);

	// Variables
	int choice, qnty;
	double price, tax, total, subtotal =0;
	final double TAX_RATE = .0975;
	
	// Menu
	System.out.println("Enter 1 for Push up Pop: ");
	System.out.println("Enter 2 for Rainbow Bomb Pop: ");
	System.out.println("Enter 3 for Drumstick: ");
	System.out.println("Enter 4 for Ice Cream Sandwich: ");
	System.out.println("Enter 5 to Exit: ");
	choice = input.nextInt(); // Find out what they want.
	
	// Start While Loop
	while (choice != 5)
	{
		if (choice > 0 && choice < 5)
		{
			// How many?
			System.out.println("Enter the quantity purchased: ");
			qnty = input.nextInt();
			
			while (qnty <=0)
			{
				System.out.println("Incorrect entry, quantity must be greater than zero.");
				qnty = input.nextInt(); // Another try at the quantity.
			}
			
			// Selection
			if (choice == 1)
			{
				price = 3.50;
				subtotal += qnty * price;
			}
			
			if (choice == 2)
			{
				price = 4.00;
				subtotal += qnty * price;
			}
			
			if (choice == 3)
			{
				price = 5.59;
				subtotal += qnty * price;
			}
			
			if (choice == 4)
			{
				price = 4.50;
				subtotal += qnty * price;
			}
			
		}  // End of If Statement
		
		else // For errors
			System.out.println("Incorrect entry. Please try again.\n");
		
		// Start the menu again
		System.out.println("Enter 1 for Push up Pop: ");
		System.out.println("Enter 2 for Rainbow Bomb Pop: ");
		System.out.println("Enter 3 for Drumstick: ");
		System.out.println("Enter 4 for Ice Cream Sandwich: ");
		System.out.println("Enter 5 to Exit: ");
		choice = input.nextInt(); // Find out what they want.
		
	} // End of While Loop
	tax = subtotal * TAX_RATE;
	total = tax + subtotal;
	System.out.println("***** Helen's Ice Cream Truck *****");
	System.out.printf(" Subtotal:      $%,.2f\n", subtotal);
	System.out.printf("Sales Tax:      $%,.2f\n", tax);
	System.out.printf("    Total:      $%,.2f\n", total);
	input.close(); 
	
	} // End of main

} //  End of class (IceCreamTruck)
