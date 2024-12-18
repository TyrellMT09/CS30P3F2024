package Account_Program;

import java.util.Scanner;

public class Customer {
	private String firstName, lastName;

	private String Street, city, province, postal_code;

	public Customer(String fName, String lName, String Stre, String ci, String pro, String pos) //modify constructor to include street, city, province, postal code
	{
		firstName = fName;
		lastName = lName;
		Street = Stre;
		city = ci;
		province = pro;
		postal_code = pos;
		
		
	}
	

	public void changeCity() {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter your city: ");
       city = input.nextLine();
       System.out.print("City updated.");
       input.close();
	}

	public void ChangeStreet() {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter your street: ");
       Street = input.nextLine();
       System.out.print("Street updated.");
       input.close();
	}
	
	 public void changeProvince() {
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter your new province: ");
	    province = input.nextLine(); // Update the province
	    System.out.println("Province updated.");
	    input.close();
	    }

	public void ChangePostalCode() {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter your postal code: ");
       postal_code = input.nextLine();
       System.out.print("Postal code updated.");
       input.close();
	}
	
	
	public String toString() {
		String custString;
		
		custString = firstName + " " + lastName + "\n" + "Address: " + Street + ", " + city + ", " + province + ", " + postal_code + "\n";
	 	return(custString);
	}
	
	
}
