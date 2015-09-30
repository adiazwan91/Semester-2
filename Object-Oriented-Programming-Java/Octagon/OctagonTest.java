package Octagon;

import java.util.*;

public class OctagonTest 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Octagon oct1 = new Octagon();
        
        System.out.println("Please input the value of side: ");
        oct1.side = input.nextDouble();
        System.out.println("The area of octagon is: "+oct1.calculateArea());
        System.out.println("The perimeter of octagon is: "+oct1.calculatePerimeter());       
    }
}
