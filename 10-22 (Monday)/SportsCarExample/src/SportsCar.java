import java.text.DecimalFormat;

public class SportsCar 	
{
	private CarType make;
	private CarColor color;
	private double price;
	
	public SportsCar(CarType aMake, CarColor aColor, double aPrice)
	{
		setMake(aMake);
		setColor(aColor);
		setPrice(aPrice);
	}

	public CarType getMake() 
	{
		return make;
	}

	public CarColor getColor() 
	{
		return color;
	}

	public double getPrice()
	{
		return price;
	}

	private void setPrice(double aPrice) 
	{
		price = aPrice;
		
	}
	
	private void setColor(CarColor aColor) 
	{
		color = aColor;
		
	}

	private void setMake(CarType aMake)
	{
		make = aMake;
		
	}
	
	public String toString()
	{
		DecimalFormat dollar = new DecimalFormat("$#,##0.00");
		String str = "Make: " + getMake() + "\nColor: " + getColor() + "\nPrice: " + dollar.format(getPrice());
		
		return str;
	}
}
