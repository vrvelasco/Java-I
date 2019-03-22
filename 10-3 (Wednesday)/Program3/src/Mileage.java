
public class Mileage {

	// Variables
	private double miles, gallons, mpg;	
	
	public Mileage() // Constructor
	{
		miles = 0;
		gallons = 0;
		mpg = 0;
	}

	// Set Miles and Gallons
	public void setMiles(double mileageMiles)
	{
		miles = mileageMiles;
	}
	

	public void setGallons(double mileageGallons)
	{
		gallons = mileageGallons;	}
	
	// Get Miles, Gallons, and MPG
	public double getMiles()
	{
		return miles;
	}
	
	public double getGallons()
	{
		return gallons;
	}
	
	public double getMPG()
	{
		// Math
		mpg = getMiles() / getGallons();
		return mpg;
	}
}
