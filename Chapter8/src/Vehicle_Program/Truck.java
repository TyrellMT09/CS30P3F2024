package Vehicle_Program;
public class Truck extends Vehicle {
	
	private String fourbyfour;
	
	public Truck(String vb, String vm, double fec, double feh, int sc, double cv, double dc, String fbf)
	{
		super(vb, vm, fec, feh, sc, cv, dc);
		fourbyfour = fbf;
	}
	
	public String getfourbyfour()
	{
		return fourbyfour;
	}
	
	public void setfourbyfour(String fbf)
	{
		fourbyfour = fbf;
	}
	
	public String toString()
	{
		return super.toString() + "\nfourbyfour: " + fourbyfour;
	}
	
}
