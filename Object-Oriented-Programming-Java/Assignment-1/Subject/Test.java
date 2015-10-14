package Subject;

import java.util.*;

public class Test 
{
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
      
       String[] arrStudent = new String[100];
       Subject dbs = new Subject("Database Systems");
       Subject oop = new Subject("Object-Oriented Programming");
       
       System.out.println("Please input the number of student to be registered: ");
       int counter = input.nextInt();
      
       dbs.addStudent(counter);
       oop.addStudent(counter);
   }
}
