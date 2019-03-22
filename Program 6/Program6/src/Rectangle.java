
public class Rectangle extends Shape
{
	private double length, height, width;

	public Rectangle(String n, double l, double h, double w) 
	{
		super(n);
		length = l;
		height = h;
		width = w;
	}
	
	public double getVolume()
	{
		return length * width * height;
	}

	public double getArea()
	{
		return length * width;
	}
}
