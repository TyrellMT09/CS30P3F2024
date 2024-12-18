package Account_Program;
public class PersonalAcct extends Account {
 
	
	
   public PersonalAcct(double bal, String fName, String lName, String Stre, String ci, String pro, String pos) {
       super(bal, fName, lName, Stre, ci, pro, pos);
  
   }
    public void Charged() {
	    if (getBalance() < 100) {
	        deposit(-2.00);
	        System.out.println("$2.00 was charged.");
	        System.out.println("");
	    }
   }
  
}
