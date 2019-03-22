import java.util.Scanner;

public class OfficeVisit 
{
	Scanner input = new Scanner(System.in);
	
	// Variables
	private double services = 0.0, medications = 0.0, subtotal = 0.0, sales = 0.0, total = 0.0;
	private final double TAX_RATE = 0.0925;
	
	public double getServices()
	{
		return services;
	}
	public void setServices(double services) 
	{
		// Loop to get the correct value
		while(services <= 0)
		{
			System.out.println("Incorrect entry.");
			System.out.println("Amount must be greater than zero.");
			System.out.println("Please try again.");
			services = input.nextInt();
		}
		this.services = services;
	}
	public double getMedications()
	{
		return medications;
	}
	public void setMedications(double medications)
	{
		// Loop until they get it correct
		while(medications <= 0)
		{
			System.out.println("Incorrect entry.");
			System.out.println("Amount must be greater than zero.");
			System.out.println("Please try again.");
			medications = input.nextInt();
		}
		this.medications = medications;
	}
	public double getSubtotal() 
	{
		// Calculate subtotal
		//Try not to use the private variables of the class.
		//subtotal = services + medications;
		subtotal = getServices() + getMedications();
		return subtotal;
	}
	public double getSales()
	{
		// Calculate sales tax
		//Try not to use the private variables of the class.
		//sales = subtotal * TAX_RATE;
		sales = getSubtotal() * TAX_RATE;
		return sales;
	}
	public double getTotal()
	{
		// Calculate total
		//Try not to use the private variables of the class.
		//total = subtotal + sales;
		total = getSubtotal() + getSales();
		return total;
	}
}
