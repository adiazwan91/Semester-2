package Student;

public class TestAbstract 
{
    public static void main(String[] args)
    {
        UndergradStudent us = new UndergradStudent(20, 15);
        PostgradStudent ps = new PostgradStudent(1000);
        
        
        System.out.println(us);
        System.out.println("The fees is: " +us.calculateFees());
        
        System.out.println(ps);
        System.out.println("The fees is: " +ps.calculateFees());
       
    }
}
