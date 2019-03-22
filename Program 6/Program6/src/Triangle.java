
public class Triangle extends Shape
{
	private double base, length, height;

	public Triangle(String n, double b, double l, double h) 
	{
		super(n);
		base = b;
		length = l;
		height = h;
	}

	public double getVolume()
	{
		return length * base * height/3;
	}

	public double getArea()
	{
		return base * height/2;
	}
}
