package zelMart;

public abstract class Employee 
{

	private String firstName, lastName;
	
	
	public Employee(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
	}
	
	public String toString()
	{
		return(firstName + " "+ lastName);
	}

	protected abstract double pay(double payArg);
	
	
}
