package Vehicle_Program;
public class Test {
	
	public static void main(String[] args) {
		Car car1 = new Car("Bentley", "Continental GT", 45, 75, 4, 12.6, 2, "None");
		Truck car2 = new Truck("Suzuki", "Carry Truck", 30, 55, 2, 0, 2, "N/A" );
		Mini_Van car3 = new Mini_Van("Honda", "Odyssey", 18, 25, 7, 38.4, 4, 2);
		
		System.out.println(car1);
		System.out.println("\n" + car2);
		System.out.println("\n" + car3);
		
	}
}
