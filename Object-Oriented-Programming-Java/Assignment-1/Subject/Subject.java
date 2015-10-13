package Subject;

import java.util.*;

public class Subject 
{
    private String subjectName;
    private static String[] arrStudent = new String[10];
    private static int studentNum;
    
    public Subject()
    {
        subjectName = null;
        arrStudent = null;
        studentNum = 0;
    }
    
    public Subject(String subjectName)
    {
        this.subjectName = subjectName;
    }
    
    public void addStudent(String[] arrStudent)
    {
       
    }
    
    public String getSubjectName()
    {
        return subjectName;
    }
    
    public String[] getArrStudent()
    {
        return arrStudent;
    }
    
    public int getStudentNum()
    {
        return studentNum;
    }

    public static void main(String[] args)
    {
       Subject dbs = new Subject("Database Systems");
       Subject oop = new Subject("Object Oriented Programming");
       
       Scanner input = new Scanner(System.in);
       int choose;
       
       System.out.println("Choose 1 for DB and 2 for OOP");
       choose = input.nextInt();
       
       if(choose == 1)
        {
            System.out.println("Please enter how many student");
            studentNum = input.nextInt();
       
                for(int i = 0; i < studentNum; i++)
                {
                    System.out.println("Please enter name");
                    arrStudent[i] = input.next();
                }
        }
       
       else if(choose == 2)
       {
            System.out.println("Please enter how many student");
            studentNum = input.nextInt();
       
                for(int j = 0; j < studentNum; j++)
                {
                    System.out.println("Please enter name");
                    arrStudent[j] = input.next();
                }
       }
       else
           System.exit(0);
       
       System.out.println("Subject Name:"+dbs.getSubjectName());
       System.out.println("Student Name:"+Arrays.toString(dbs.getArrStudent()));
       System.out.println("Student Number:"+dbs.getStudentNum());
       System.out.println("Subject Name:"+oop.getSubjectName());        
       System.out.println("Student Name:"+Arrays.toString(oop.getArrStudent()));
       System.out.println("Student Number:"+oop.getStudentNum());
    }
}
