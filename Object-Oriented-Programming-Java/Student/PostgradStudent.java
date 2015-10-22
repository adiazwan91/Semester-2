package Student;

public class PostgradStudent extends Student implements Researchable 
{
    private double semesterFee;
    
    public PostgradStudent()
    {
        super();
    }
    
    public PostgradStudent(double semesterFee)
    {
        super("1017");
        this.semesterFee = semesterFee;
    }
    
    public double getSemesterFee()
    {
        return semesterFee;
    }
    
    public void setSemesterFee(double semesterFee)
    {
        this.semesterFee = semesterFee;
    }
    
    public double calculateFees()
    {
        return semesterFee;
    }
    
    public double doResearchAllowance()
    {
        double allowance;
        allowance = semesterFee/10;
        return allowance;
    }
    
    public String toString()
    {
        return "Postgrad Student: \nSemester Fee: "+semesterFee+"\n"+super.toString()+"\n";
    }
}
