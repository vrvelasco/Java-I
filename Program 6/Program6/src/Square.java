
public class Square extends Shape
{
	private double side;
	
	public Square(String n, double s) 
	{
		super(n);
		side = s;
	}
	
	public double getVolume()
	{
		return side * side * side;
	}

	public double getArea()
	{
		return side * side;
	}
}
