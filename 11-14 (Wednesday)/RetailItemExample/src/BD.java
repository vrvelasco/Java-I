
public class BD implements RetailItem
{
	private String title;
	private String genre;
	private double retailPrice;
	
	public BD(String t, String g, double p)
	{
		setTitle(t);
		setGenre(g);
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

	public String getGenre() 
	{
		return genre;
	}

	public void setGenre(String g) 
	{
		genre = g;
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
