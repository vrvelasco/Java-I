
public class Ship 
{
	private String name; // Name of the ship
	private String year; // Year ship was built
	private String toStr = "";
	
	public Ship(String n, String y) // Constructor 
	{
		setName(n);
		setYear(y);
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getYear() 
	{
		return year;
	}

	public void setYear(String year) 
	{
		this.year = year;
	}

	@Override
	public String toString() 
	{
		toStr += "\nShip Name: " + getName() + "\t\tBuild Year: " + getYear();
		
		return toStr;
	}
}
