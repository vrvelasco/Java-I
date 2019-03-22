import java.util.Scanner;
import java.text.DecimalFormat;

public class HelensMain
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		
		final double TAX_RATE = 0.0925;
		double price, subtotal = 0, total, salesTax;
		int prodID, qnty;
		
		prodID = displayMenu(input);
			
		while (prodID != 6)
		{
			if (prodID > 0 && prodID < 6)
			{
			System.out.println("Enter the quantity purchased: ");
			qnty = input.nextInt();
			
			while (qnty<=0)
			{
				System.out.println("Quantity must be greater than zero: ");
				qnty = input.nextInt();
			} // while (qnty<=0)
			
			switch (prodID)
			{
			case 1:
				price = 5.99;
				subtotal += price * qnty;
				break;
			case 2:
				price = 6.49;
				subtotal += price * qnty;
				break;
			case 3: 
				price = 4.95;
				subtotal += price * qnty;
				break;
			case 4:
				price = 6.99;
				subtotal += price * qnty;
				break;
			case 5:
				price = 7.99;
				subtotal += price * qnty;
				break;
			} // End of switch
			
			} // End of if
			else
			System.out.println("Incorrect entry. Please try again.");
			
			prodID = displayMenu(input);
			
		} // End of while (prodID != 6) 
		
		// Math
		salesTax = subtotal * TAX_RATE;
		total = subtotal + salesTax;
		
		// Display
		System.out.println("Subtotal:   $" + dollar.format(subtotal));
		System.out.println("Sales Tax:  $" + dollar.format(salesTax));
		System.out.println("Total:      $" + dollar.format(total));
		
		input.close();
	} // End of main
	
	public static int displayMenu(Scanner input)
	{
		int prodID;
		
		// Menu
		System.out.println("\n***** Helen's Healings *****");
		System.out.println("Enter 1 for Aspirin: \nEnter 2 for Ibuprofen: "
		+ "\nEnter 3 for Acetaminophen: \nEnter 4 for Naproxen Sodium: "
		+ "\nEnter 5 for Prilosec: \nEnter 6 to Exit: " );
		prodID = input.nextInt();
		return prodID;
		}
	
} // End of class
