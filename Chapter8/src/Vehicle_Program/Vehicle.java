package Vehicle_Program;
public abstract class Vehicle {
	
	private String VehicleBrand, VehicleModel;
	private double fuelEconomyCity, fuelEconomyHwy, seatingCapacity, cargoVolume, doorCapacity;
	
	public Vehicle(String vb, String vm, double fec, double feh, double sc, double cv, double dc)
	{
		VehicleBrand = vb;
		VehicleModel = vm;
		fuelEconomyCity = fec;
		fuelEconomyHwy = feh;
		seatingCapacity = sc;
		cargoVolume = cv;
		doorCapacity = dc;
	}
	
	public String getVehicleBrand()
	{
		return VehicleBrand;
	}
	
	public String getVehicleModel()
	{
		return VehicleModel;
	}
	
	public double getFuelEconomyCity()
	{
		return fuelEconomyCity;
	}
	
	public double getFuelEconomyHighWay()
	{
		return fuelEconomyHwy;
	}
	
	public double getSeatingCapacity()
	{
		return seatingCapacity;
	}
	
	public double getCargoVolume()
	{
		return cargoVolume;
	}
	
	public double getDoorCapacity()
	{
		return doorCapacity;
	}
	
	public void setVehicleBrand(String vb)
	{
		VehicleBrand = vb;
	}
	
	public void setVehicleModel(String vm)
	{
		VehicleModel = vm;
	}
	
	public void setFuelEconomyCity(double fec)
	{
		fuelEconomyCity = fec;
	}
	
	public void setFuelEconomyHighWay(double feh)
	{
		fuelEconomyHwy = feh;
	}
	
	public void setSeatingCapacity(double sc)
	{
		seatingCapacity = sc;
	}
	
	public void setCargoVolume(double cv)
	{
		cargoVolume = cv;
	}
	
	public void setdoorCapacity(double dc)
	{
		doorCapacity = dc;
	}
	
	public String toString()
	{
		return("Vehicle Brand: " + VehicleBrand
				+"\nVehicle Model: " + VehicleModel
				+"\nFuel economy in the city: " + fuelEconomyCity + " MPH"
				+"\nFuel economy in the highway: " + fuelEconomyHwy	+ " MPH"
				+"\nSeating Capacity: " + seatingCapacity
				+"\nCargo Volume: " + cargoVolume
				+"\ndoorCapacity: " + doorCapacity);
	}
}
