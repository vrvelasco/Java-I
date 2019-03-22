
public class Circle extends Shape
{
	private double radius;
	
	public Circle(String n, double r) 
	{	
		super(n);
		radius = r;
	}
	
	public double getVolume()
	{
		return 4/3 * Math.PI * radius * radius * radius;
	}

	public double getArea()
	{
		return Math.PI * radius * radius;
	}
}
