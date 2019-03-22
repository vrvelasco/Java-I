
public class Distance
{
	private double speed, time, totalDistance;
	
	public Distance() // Constructor
	{
		speed = 0;
		time = 0;
		totalDistance = 0;
	}

	public double getSpeed()
	{
		return speed;
	}

	public void setSpeed(double speed) 
	{
		this.speed = speed;
	}

	public double getTime()
	{
		return time;
	}

	public void setTime(double time)  
	{
		this.time = time;
	}
	
	public double getDistance()
	{
		// Math
		totalDistance = getSpeed() * getTime();
		return totalDistance;
	}
}
