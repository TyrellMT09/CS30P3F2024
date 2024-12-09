package zelMart;

public class Manager extends Employee 
{
	private double yearlySalary;
	
	//A manager object has been created
	public Manager(String fN, String lN, double S)
	{
		super(fN, lN);
		yearlySalary = S;
	}
	
	//Return the Manager salary
	public double getYearlySalary()
	{
		return yearlySalary;
	}
	
	//Return the manager pay for a specified period
	public double pay(double weeks)
	{
		double payEarned;
		
		payEarned = yearlySalary / 52 * weeks;
		
		return payEarned;
	}
	
	//Returns the employee name, title, and salary
	public String toString()
	{
		return(super.toString()
				+ ", Manager"
				+ "Salary: "
				+ yearlySalary);
	}
	

}