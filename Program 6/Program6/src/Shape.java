
public abstract class Shape 
{
	protected String shapeName;
	
	public Shape(String name)
	{
		shapeName = name;
	}
	
	public String getName()
	{
		return shapeName;
	}
	
	public abstract double getArea();
	
	public abstract double getVolume();
}
