package Vehicle_Program;
public class Car extends Vehicle {
	
	private String Convertiable;
	
	public Car(String vb, String vm, double fec, double feh, int sc, double cv, double dc, String c)
	{
		super(vb, vm, fec, feh, sc, cv, dc);
		Convertiable = c;
	}
	
	public String getConvertiable()
	{
		return Convertiable;
	}
	
	public void setConvertiable(String c)
	{
		Convertiable = c;
	}
	
	public String toString()
	{
		return super.toString() + "\nConvertiable: " + Convertiable;
	}
	
}
