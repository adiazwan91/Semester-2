package my.edu.unikl.partOfClass;

public class Door 
{
	public String doorType;
	
	public Door()
	{
		
	}
	
	public void open()
	{
		System.out.println("door-open");
	}
	
	public void close()
	{
		System.out.println("door-close");
	}
	
	public String toString()
	{
		return "Door type "+doorType;
	}
}
