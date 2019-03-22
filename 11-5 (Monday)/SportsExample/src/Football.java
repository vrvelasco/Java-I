
public class Football extends Sport
{
	private String teamName, location;

	public Football(String n, int noPlay, int s, String tName, String loc) 
	{
		super(n, noPlay, s);
		setTeamName(tName);
		setLocation(loc);
	}

	public String getTeamName() 
	{
		return teamName;
	}

	public void setTeamName(String teamName) 
	{
		this.teamName = teamName;
	}

	public String getLocation() 
	{
		return location;
	}

	public void setLocation(String location) 
	{
		this.location = location;
	}

}
