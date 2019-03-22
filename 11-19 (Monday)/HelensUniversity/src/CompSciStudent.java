
public class CompSciStudent extends Student 
{
	private final int MATH_HOURS = 20, CS_HOURS = 40, GEN_ED = 60;
	
	private int mathHours, csHours, genEdHours;
	
	public CompSciStudent(String n, String id, int year)
	{
		super(n, id, year);
	}

	public void setMathHours(int mathHours) 
	{
		this.mathHours = mathHours;
	}

	public void setCsHours(int csHours) 
	{
		this.csHours = csHours;
	}

	public void setGenEdHours(int genEdHours) 
	{
		this.genEdHours = genEdHours;
	}
	
	public String toString()
	{
		String str;
		str = super.toString() + "\nMajor: Computer Science" + "\nMath Hours Taken: " + mathHours + "\nComputer Science Hours Taken: " + csHours + "\nGeneral Ed Hours Taken: " + genEdHours;
		
		return str;
	}
	
	public int getRemainingHours()
	{
		int regHours, remainingHours;
		
		regHours = MATH_HOURS + CS_HOURS + GEN_ED;
		
		remainingHours = regHours - (mathHours + csHours + genEdHours);
		
		return remainingHours;
	}
}
