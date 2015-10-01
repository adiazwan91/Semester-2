package Account;

public class AccountTest 
{
 
   public static void main(String[] args)
   {
       Account a = new Account();
             
       a.setId(1122);
       a.setBalance(20000);
       a.setAnnualInterestRate(4.5);
       a.dePosit(3000.00);
       a.withDraw(2500.00);
       
       System.out.println("Welcome User, Your id number is: "+a.getId()); //Purposely display the id number without permission
       System.out.println("The account balance is: "+a.getBalance());
       System.out.println("The monthly interest is: "+a.getMonthlyInterest());
       System.out.println("The date account created is: "+a.getDateCreated());
       
    }
    
}
