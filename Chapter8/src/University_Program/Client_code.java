package University_Program;



public class Client_code {

	public static void main(String[] args)
	{
		
		Staff emp1 = new Staff("Rick", " Johnson ", 65000, " Teacher");
		Faculty emp2 = new Faculty("Paul", " Johnson ", 30000, " mathematics");
		
		System.out.println("Staff: " + emp1 + "\nFaculty: " + emp2 );
	}
	
}
