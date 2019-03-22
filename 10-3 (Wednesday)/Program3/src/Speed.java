
public class Speed
{
	private double distance, time, mph;

	public Speed() // Constructor
	{
		distance = 0;
		time = 0;
		mph = 0;
	}
	
	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}
	
	public double getMPH()
	{
		// Math
		mph = getDistance() / getTime();
		return mph;
	}
}
