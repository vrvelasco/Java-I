
public class Quote 
{
	// Variables
	private double partsCharges;
	private double laborCharges;
	
	public Quote() // Constructor
	{
		partsCharges = 0;
		laborCharges = 0;
	}
	
	public void setPartsCharges(double parts)
	{
		partsCharges = parts;
	}
	
	public void setLaborCharges(double labor)
	{
		laborCharges = labor;
	}
	
	public double getPartsCharges()
	{
		return partsCharges;
	}
	
	public double getLaborCharges()
	{
		return laborCharges;
	}
	
	public double getSalesTax()
	{
		final double TAX_RATE = .0925;
		double subtotal = getPartsCharges() + getLaborCharges();
		return subtotal * TAX_RATE;
	}
	
	public double getTotal()
	{
		return getLaborCharges() + getPartsCharges() + getSalesTax();
	}
}
