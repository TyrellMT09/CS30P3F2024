package Account_Program;
public class Test {
   public static void main(String[] args) {
      
       PersonalAcct personalAccount = new PersonalAcct(80, "Rick", "Johnson", "17 st NE", "Calgary", "Alberta", "ABCDEF");
       personalAccount.Charged();
      
       BusinessAcct businessAcount = new  BusinessAcct(80, "Rick", "Johnson", "17 st NE", "Calgary", "Alberta", "ABCDEF");
       businessAcount.Charged();
      
       System.out.println(personalAccount);
      
      
   }
}

