package Loan;

public class HomeLoan extends Loan
{
    private String typeOfHome;
    
    public HomeLoan()
    {
        super();
        typeOfHome = null;
    }
    
    public HomeLoan(String typeOfHome)
    {
        super();
        this.typeOfHome = typeOfHome;
    }
    
    public HomeLoan(String typeOfHome, double annualInterestRate, int numberOfYears, double loanAmount)
    {
        super(annualInterestRate, numberOfYears, loanAmount);
        this.typeOfHome = typeOfHome;
    }
    
    public String getTypeOfHome()
    {
        return typeOfHome;
    }
    
    public void setTypeOfHome(String typeOfHome)
    {
        this.typeOfHome = typeOfHome;
    }
}
