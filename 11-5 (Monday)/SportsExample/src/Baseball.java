
public class Baseball extends Sport
{
	private String teamName, location;
	private int noHomeRuns;

	public Baseball(String n, int noPlay, int s, String tName, String loc, int hr) 
	{
		super(n, noPlay, s);
		setTeamName(tName);
		setLocation(loc);
		setNoHomeRuns(hr);
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

	public int getNoHomeRuns() {
		return noHomeRuns;
	}

	public void setNoHomeRuns(int noHomeRuns) 
	{
		this.noHomeRuns = noHomeRuns;
	}

}
