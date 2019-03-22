
public class CargoShip extends Ship
{
	private int tons;
	private String toStr = "";

	
	public CargoShip(String n, String y, int t) 
	{
		super(n, y);
		setTons(t);
	}

	public int getTons() 
	{
		return tons;
	}

	public void setTons(int tons) 
	{
		this.tons = tons;
	}

	@Override
	public String toString() 
	{
		toStr += "\nCargo Ship Name: " + getName() + "\tMaximum Number of Tons: " + getTons();
		
		return toStr;
	}

}
