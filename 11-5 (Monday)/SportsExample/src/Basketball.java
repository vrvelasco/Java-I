
public class Basketball extends Sport
{
	private String teamName, location;
	private int noSlamDunks;

	public Basketball(String n, int noPlay, int s, String tName, String loc, int sd) 
	{
		super(n, noPlay, s);
		setTeamName(tName);
		setLocation(loc);
		setNoSlamDunks(sd);
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

	public int getNoSlamDunks() 
	{
		return noSlamDunks;
	}

	public void setNoSlamDunks(int noSlamDunks) 
	{
		this.noSlamDunks = noSlamDunks;
	}

}
