package Account_Program;

import java.text.NumberFormat;

public class Account {
	private double balance;
	private Customer cust;
	private String acctID;

	public Account(double bal, String fName, String lName, String Stre, String ci, String pro, String pos)//include street, city, province or state, postal code or zip code
	 {
		balance = bal;
		cust = new Customer(fName, lName, Stre, ci, pro, pos);//this constructor should reflect the new additions above, street, city, province, postal code
		acctID = fName.substring(0,1) + lName;
	}

	public Account(String ID) {
		balance = 0;
		cust = new Customer("", "", "", "", "", "");
		acctID = ID;
	}

	public String getID() {
	 	return(acctID);
	}

	public double getBalance() {
	 	return(balance);
	}

	public void deposit(double amt) {
	 	balance += amt;
	}

	public void withdrawal(double amt) {
	 	if (amt <= balance) {
	 		balance -= amt;
	 	} else {
	 		System.out.println("Not enough money in account.");
	 	}
	}

	 public void changeAddress() {
	        cust.ChangeStreet();
	        cust.changeCity();
	        cust.changeProvince();
	        cust.ChangePostalCode();
	    }
	 
	public boolean equals(Object acct) {
		Account testAcct = (Account)acct;
		if (acctID.equals(testAcct.acctID)) {
				return(true);
			} else {
				return(false);
			}
	}

	public String toString() {
		String accountString;
		NumberFormat money = NumberFormat.getCurrencyInstance();


		accountString = "ID: " + acctID + "\n";
		accountString += cust.toString();
		accountString += "Current balance is " + money.format(balance);
	 	return(accountString);
	}
}


