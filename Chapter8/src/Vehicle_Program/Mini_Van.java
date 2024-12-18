package Vehicle_Program;
public class Mini_Van extends Vehicle {
	
	private double Sliding_Door;
	
	public Mini_Van(String vb, String vm, double fec, double feh, int sc, double cv, double dc, double sd)
	{
		super(vb, vm, fec, feh, sc, cv, dc);
		Sliding_Door = sd;
	}
	
	public double getSliding_Door()
	{
		return Sliding_Door;
	}
	
	public void setSliding_Door(double sd)
	{
		Sliding_Door = sd;
	}
	
	public String toString()
	{
		return super.toString() + "\nSliding Doors: " + Sliding_Door;
	}
}
	
