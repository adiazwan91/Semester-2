package Loan;

public class CarLoan extends Loan 
{
    private String carName;
    
    public CarLoan()
    {
        super();
        carName = null;
    }
    
    public CarLoan(String carName)
    {
        super();
        this.carName = carName;
    }
    
    public String getCarName()
    {
        return carName;
    }
    
    public void setCarName(String carName)
    {
        this.carName = carName;
    }
}
