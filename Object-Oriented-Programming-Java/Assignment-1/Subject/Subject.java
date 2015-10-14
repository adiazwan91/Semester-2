package Subject;

import java.util.*;

public class Subject 
{
    private String subjectName;
    private String[] arrStudent = new String[100];
    private int studentNum;
    
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
    
    public void addStudent(int counter)
    {
       Scanner input = new Scanner(System.in);
       for(int i = 0; i < counter; i++)
       {
           int choose;
           System.out.println("Please enter subject name: 1 for Database Systems and 2 for Object-Oriented Programming");
           choose = input.nextInt();
  
           if(choose == 1)
           {
            subjectName = "Database Systems";
            System.out.println("Please input student name: ");
            arrStudent[i] = input.next();
            studentNum = studentNum + 1;
           }
           
           else if(choose == 2)
           {
            subjectName = "Object-Oriented Programming";
            System.out.println("Please input student name: ");
            arrStudent[i] = input.next();
            studentNum = studentNum + 1;
           }
           else 
               System.exit(0);
           
        }
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
}
