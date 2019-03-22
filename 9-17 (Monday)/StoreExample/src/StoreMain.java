import java.util.Scanner;
import java.text.DecimalFormat;

public class StoreMain 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,##0.00");
		
		final double TAX_RATE = 0.0975;
		double subtotal = 0.0, tax, price, total;
		int choice, qnty;
		
		// Menu
		System.out.println("Enter 1 for Milk: \nEnter 2 for Soda: "
				+ "\nEnter 3 for Bread: \nEnter 4 for Ice Cream: "
				+ "\nEnter 5 for Soup: \nEnter 6 to exit:  ");
		choice = input.nextInt();
		
		while (choice != 6)
		{
			if (choice > 0 && choice < 6)
			{
				System.out.println("Enter the quantity purchased: ");
				qnty = input.nextInt();
				
				while (qnty <= 0)
				{
					System.out.println("Quantity must be greater than zero: ");
				qnty = input.nextInt();
				}
				switch (choice)
				{
				case 1:
				{
					price = 2.39;
					subtotal += qnty * price;
					break;
				}
				case 2:
				{
					price = 3.50;
					subtotal += qnty * price;
					break;
				}
				case 3:
				{
					price = 2.39;
					subtotal += qnty * price;
					break;
				}
				case 4:
				{
					price = 3.99;
					subtotal += qnty * price;
					break;
				}
				case 5:
				{
					price = 1.50;
					subtotal += qnty * price;
					break;
				}
				} // End of switch
			} // End of if (choice > 0 && choice < 6)
			else
				System.out.println("Incorrect entry.");
			
			// Menu
			System.out.println("Enter 1 for Milk: \nEnter 2 for Soda: "
					+ "\nEnter 3 for Bread: \nEnter 4 for Ice Cream: "
					+ "\nEnter 5 for Soup: \nEnter 6 to exit:  ");
			choice = input.nextInt();
		}// End of while (choice != 6)
		tax = subtotal * TAX_RATE;
		total = subtotal + tax;
		
		// Display
		System.out.println("***** Total Sale *****");
		System.out.println("Subtotal:    $" + df.format(subtotal));
		System.out.println("Sales Tax:   $" + df.format(tax));
		System.out.println("Total:       $" + df.format(total));
		
		// Close input
		input.close();
	}

}
