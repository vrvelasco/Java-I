
public class Car 
{
	private String make;
	private String model;
	private int year;
	
	public Car() // Constructor
	{
		make = "";
		model = "";
		year = 0;
	}
	
	public void setMake(String ma)
	{
		make = ma;
	}
	
	public void setModel(String mo)
	{
		model =mo;
	}
	
	public void setYear(int y)
	{
		year = y;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public int getYear()
	{
		return year;
	}
}
