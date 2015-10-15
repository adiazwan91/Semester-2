package Loan;

public class LoanTest 
{
    public static void main(String[] args)
    {
        CarLoan cl1 = new CarLoan();
        CarLoan cl2 = new CarLoan("Proton Persona");
        Loan p1 = new CarLoan();
        
        HomeLoan hl1 = new HomeLoan();
        HomeLoan hl2 = new HomeLoan();
        Loan p1 = new HomeLoan();
        //System.out.println(cl1);
        //System.out.println(cl2);
        
        cl1.setCarName("Proton Exora");
        cl1.setAnnualInterestRate(3.5);
        cl1.setNumberOfYears(9);
        cl1.setLoanAmount(70000);
        
        cl2.setCarName("Proton Persona");
        cl2.setAnnualInterestRate(3.5);
        cl2.setNumberOfYears(3);
        cl2.setLoanAmount(50000);
        
        hl1.setTypeOfHome("Bungalow");
        hl1.setAnnualInterestRate(5.5);
        hl1.setNumberOfYears(5);
        hl1.setLoanAmount(250000);
        
        hl2.setTypeOfHome("Double Storey Terrace");
        hl2.setAnnualInterestRate(5.5);
        hl2.setNumberOfYears(10);
        hl2.setLoanAmount(2000000);
        
        System.out.println("The car name is: "+cl1.getCarName()+"\n");
        System.out.println("The annual interest rate is: "+cl1.getAnnualInterestRate()+"\n");
        System.out.println("The number of years: "+cl1.getNumberOfYears()+"\n");
        System.out.println("The loan amount is: "+cl1.getLoanAmount()+"\n");
        System.out.println("The monthly payment is: "+cl1.getMonthlyPayment()+"\n");
        System.out.println("The total payment is: "+cl1.getTotalPayment()+"\n");
        
        System.out.println("The car name is: "+cl2.getCarName()+"\n");
        System.out.println("The annual interest rate is: "+cl2.getAnnualInterestRate()+"\n");
        System.out.println("The number of years: "+cl2.getNumberOfYears()+"\n");
        System.out.println("The loan amount is: "+cl2.getLoanAmount()+"\n");
        System.out.println("The monthly payment is: "+cl2.getMonthlyPayment()+"\n");
        System.out.println("The total payment is: "+cl2.getTotalPayment()+"\n");
        
        System.out.println("The type of home is: "+hl1.getTypeOfHome()+"\n");
        System.out.println("The annual interest rate is: "+hl1.getAnnualInterestRate()+"\n");
        System.out.println("The number of years: "+hl1.getNumberOfYears()+"\n");
        System.out.println("The loan amount is: "+hl1.getLoanAmount()+"\n");
        System.out.println("The monthly payment is: "+hl1.getMonthlyPayment()+"\n");
        System.out.println("The total payment is: "+hl1.getTotalPayment()+"\n");
        
        System.out.println("The type of home is: "+hl2.getTypeOfHome()+"\n");
        System.out.println("The annual interest rate is: "+hl2.getAnnualInterestRate()+"\n");
        System.out.println("The number of years: "+hl2.getNumberOfYears()+"\n");
        System.out.println("The loan amount is: "+hl2.getLoanAmount()+"\n");
        System.out.println("The monthly payment is: "+hl2.getMonthlyPayment()+"\n");
        System.out.println("The total payment is: "+hl2.getTotalPayment()+"\n");
               
        
    }
}

