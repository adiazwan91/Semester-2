package Student;

public abstract class Student 
{
    protected String studID;
    
    protected Student()
    {
        studID = null;
    }
    
    protected Student(String studID)
    {
        this.studID = studID;
    }
    
    public String toString()
    {
        return "Student ID: "+studID;
    }
    
    public abstract double calculateFees();
}
