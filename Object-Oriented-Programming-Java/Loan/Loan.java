package Loan;

public class Loan 
{
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    
    public Loan()
    {
        annualInterestRate = 0.0;
        numberOfYears = 0;
        loanAmount = 0.0;
    }
    
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount)
    {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }
    
    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    
    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }
    
    public int getNumberOfYears()
    {
        return numberOfYears;
    }    
    
    public void setNumberOfYears(int numberOfYears)
    {
        this.numberOfYears = numberOfYears;
    }
    
    public double getLoanAmount()
    {
        return loanAmount;
    }
    
    public void setLoanAmount(double loanAmount)
    {
        this.loanAmount = loanAmount;
    }
    
    public double getMonthlyPayment()
    {
        double mp = 0.0;
        double p = loanAmount;
        double r = annualInterestRate / 1200;
        double n = numberOfYears;
        
        mp = (p * r * Math.pow(1+r, n))/(Math.pow(1+r, n)-1);
        return mp;
    }
    
    public double getTotalPayment()
    {
        double tp = 0.0;
        tp = getMonthlyPayment() * numberOfYears;
        return tp;
    }
}
