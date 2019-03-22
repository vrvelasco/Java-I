
public class CD implements RetailItem
{
	private String title;
	private String artist;
	private double retailPrice;
	
	public CD(String t, String a, double p)
	{
		setTitle(t);
		setArtist(a);
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

	public String getArtist() 
	{
		return artist;
	}

	public void setArtist(String a) 
	{
		artist = a;
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
