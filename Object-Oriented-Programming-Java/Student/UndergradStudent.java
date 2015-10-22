package Student;

public class UndergradStudent extends Student
{
   private double ratePerCredit;
   private double creditHour;
   
   public UndergradStudent()
   {
       super();
   }
   public UndergradStudent(double ratePerCredit, double creditHour)
   {
       super("1016");
       this.ratePerCredit = ratePerCredit;
       this.creditHour = creditHour;
   }
   
   public double getRatePerCredit()
   {
       return ratePerCredit;
   }
   
   public void setRatePerCredit(double ratePerCredit)
   {
       this.ratePerCredit = ratePerCredit;
   }
   
   public double getCreditHour()
   {
       return creditHour;
   }
   
   public void setCreditHour(double creditHour)
   {
       this.creditHour = creditHour;
   }
   
   public double calculateFees()
   {
       double fees = 0;
       fees = ratePerCredit * creditHour;
       return fees;
   }
   
   public String toString()
   {
       return "Undergrad student: \nRate Per Credit:"+ratePerCredit+" \nCredit Hour:"+creditHour+ "\n"+super.toString()+"\n";
   }
}
