package Sales;
import java.util.Arrays;

public class Sales 
{
    private String salesId;
    private double amount;
    
    public Sales()
    {
        salesId = null;
        amount = 0.0;
    }
    
    public Sales(String salesId, double amount)
    {
        this.salesId = salesId;
        this.amount = amount;
    }
    
    public String getSalesId()
    {
        return salesId;
    }
    
    public void setSalesId(String salesId)
    {
        this.salesId = salesId;
    }
    
    public double getAmount()
    {
        return amount;
    }
    
    public void setAmount(double amount)
    {
        this.amount = amount;
    }
    
    public double determineDiscount()
    {
        double discount = 0;
        
        if(amount >= 900)
        {
            discount = amount * 0.1;
        }
        
        else if(amount >= 500 && amount < 900)
        {
            discount = amount * 0.08;
        }
        
        else if(amount > 0 && amount < 500)
        {
            discount = amount * 0.04;
        }
       return discount;
    }
    
    public void displaySalesObject(String salesId, double amount)
    {
       System.out.println("Sale id"+ salesId);
       System.out.println("Amount"+ amount+"\n");
       
    }
    
    public void displaySalesArray(String[] idArray, double[] amountArray)
    {
        System.out.println("Sale id"+(Arrays.toString(idArray)));
        System.out.println("Amount"+(Arrays.toString(amountArray)));
    }
}
