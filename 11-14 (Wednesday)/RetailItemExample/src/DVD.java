
public class DVD implements RetailItem
{
	private String title;
	private int runTime;
	private double retailPrice;
	
	public DVD(String t, int rt, double p)
	{
		setTitle(t);
		setRunTime(rt);
		setRetailPrice(p);
	}

	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String t) 
	{
		title = t;
	}

	public int getRunTime() 
	{
		return runTime;
	}

	public void setRunTime(int rt) 
	{
		runTime = rt;
	}

	public double getRetailPrice() 
	{
		return retailPrice;
	}

	public void setRetailPrice(double p) 
	{
		retailPrice = p;
	}
	

}
