
public class Sport
{
	private String name;
	private int numPlayers, scores;
	
	// Constructor
	public Sport(String n, int noPlay, int s)
	{
		setName(n);
		setNumPlayers(noPlay);
		setScores(s);
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getNumPlayers() 
	{
		return numPlayers;
	}

	public void setNumPlayers(int numPlayers) 
	{
		this.numPlayers = numPlayers;
	}

	public int getScores() 
	{
		return scores;
	}

	public void setScores(int scores) 
	{
		this.scores = scores;
	}
	
	
}
