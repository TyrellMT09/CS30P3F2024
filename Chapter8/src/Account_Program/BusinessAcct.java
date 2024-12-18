package Account_Program;
public class BusinessAcct extends Account {
	
   public BusinessAcct(double bal, String fName, String lName, String Stre, String ci, String pro, String pos) {
       super(bal, fName, lName, Stre, ci, pro, pos);
    
   }
 
  
   public void Charged() {
	    if (getBalance() < 500) {
	        deposit(-10.00);
	        System.out.println("$10.00 was charged.");
	        System.out.println("");
	    }
   }
  
}
