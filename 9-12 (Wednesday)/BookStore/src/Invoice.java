import java.util.Scanner;

public class Invoice
{
	private int qnty;
	private double price;
	final double TAX_RATE = 0.0975;
	
	Scanner input = new Scanner(System.in);
	
	public int getQnty()
	{
		return qnty;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public double getSalesTax()
	{
		return getQnty() * getPrice() * TAX_RATE;
	}
	
	public double getTotal()
	{
		return (getQnty() * getPrice()) + getSalesTax();
	}
	
	public void setQnty(int q)
	{
		while(q <= 0)
		{
			System.out.println("Incorrect entry.");
			System.out.println("Quantity must be greater than zero.");
			System.out.println("Please try again.");
			q = input.nextInt();
		}
		qnty = q;
	}
	
	public void setPrice(double p)
	{
		while(p <= 0)
		{
			System.out.println("Incorrect entry.");
			System.out.println("Quantity must be greater than zero.");
			System.out.println("Please try again.");
			p = input.nextDouble();
		}
		price = p;
	}
}
