package Account;
import java.util.*;

public class Account 
{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    
    public Account()
    {
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
        dateCreated = new Date();
    }
    
    public int getId()
    {
        return id;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public void setBalance(double balance)
    {     
        this.balance = balance;
    }
    
    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    
    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate/100;
    }  
    
    public Date getDateCreated()
    {
        return dateCreated;
    }
    
    public double getMonthlyInterest()
    {   
        double monthlyInterest;
        monthlyInterest = ((annualInterestRate)/12) * balance;
        return monthlyInterest;
    }
    
    public double withDraw(double withdraw)
    {
        balance = balance - withdraw;
        return withdraw;
    }
    
    public double dePosit(double deposit)
    {
        balance = balance + deposit;
        return deposit;
    }
}
