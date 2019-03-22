
public class CruiseShip extends Ship
{
	private int passengers;
	private String toStr = "";
	
	public CruiseShip(String n, String y, int p) 
	{
		super(n, y);
		setPassengers(p);
	}

	public int getPassengers() 
	{
		return passengers;
	}

	public void setPassengers(int passengers) 
	{
		this.passengers = passengers;
	}

	@Override
	public String toString() 
	{
		toStr += "\nCruise Ship Name: " + getName() + "\tMaximum Passengers: " + getPassengers();
		
		return toStr;
	}

}
