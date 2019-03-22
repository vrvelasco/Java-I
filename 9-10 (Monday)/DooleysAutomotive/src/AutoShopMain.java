import java.util.Scanner;
import java.text.DecimalFormat;
public class AutoShopMain
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		
		// Create copy of my class
		Customer myCustomer = new Customer();
		Car myCar = new Car();
		Quote myQuote = new Quote();
		
		// Get Car info from user
		System.out.println("Enter the year of the car: ");
		int year = input.nextInt();
		
		// Get rid of "Enter" error
		// This is for getting int and String at the same time.
		input.nextLine(); // End error correction
		
		System.out.println("Enter the make of the car: ");
		String make = input.nextLine();
		
		System.out.println("Enter the model of the car: ");
		String model = input.nextLine();
	
		// Send to Class  ** Not necessary **
		myCar.setMake(make);
		myCar.setModel(model);
		myCar.setYear(year);
		
		// Get and set Customer info
		System.out.println("Enter the name of the customer: ");
		myCustomer.setName(input.nextLine());
		
		System.out.println("Enter the address of the customer: ");
		myCustomer.setAddress(input.nextLine());
		
		System.out.println("Enter the phone number of the customer: ");
		myCustomer.setPhone(input.nextLine());
		
		// Get and set Parts and Labor
		System.out.println("Enter the parts charges: $");
		myQuote.setPartsCharges(input.nextDouble());
		
		System.out.println("Enter the labor charges: $");
		myQuote.setLaborCharges(input.nextDouble());
		
		// Display invoice
		System.out.println("This quote is for: " + myCustomer.getName());
		System.out.println("The parts charges: $" + dollar.format(myQuote.getPartsCharges()));
		System.out.println("The labor charges: $" + dollar.format(myQuote.getLaborCharges()));
		System.out.println("The Sales Tax: $" + dollar.format(myQuote.getSalesTax()));
		System.out.println("The total sale: $" + dollar.format(myQuote.getTotal()));
		
		// Close input
		input.close();
	}
			
}
