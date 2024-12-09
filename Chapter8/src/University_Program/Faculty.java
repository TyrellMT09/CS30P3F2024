package University_Program;

public class Faculty extends UEmployee{
	
	private String department;
	
	public Faculty(String fn, String ln, double s, String d)
	{
		super(fn, ln, s);
		department = d;
	}
	
	public String getDepartment()
	{
		return department;
	}
	
	public void setDepartment(String d)
	{
		department = d;
	}
	
	public String toString()
	{
		return(super.getFirstName()
				+ super.getLastName()
				+ super.getSalary()
				+ department);
	}
	
}
