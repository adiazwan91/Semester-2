package Sales;

import java.util.*;

public class Test 
{
    public static void main(String[] args)
    {   
        Scanner input = new Scanner(System.in);
        Sales s1 = new Sales();
        Sales s2 = new Sales("SALE7003", 400);
        Sales s3 = new Sales();
       
        
        int[] salesArray = new int[4];
        String[] idArray = new String[4];
        double[] amountArray = new double[4];
        
        s1.displaySalesObject("SALE6003", 800);
        s2.displaySalesObject("SALE5003", 500);
      
        for(int i = 0; i < salesArray.length; i++)
        {
            System.out.println("Sale id");
            idArray[i] = input.next();
      
            System.out.println("amount");
            amountArray[i] = input.nextDouble();     
        }
        s3.displaySalesArray(idArray, amountArray);
    }
}
