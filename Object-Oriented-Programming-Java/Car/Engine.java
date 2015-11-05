package my.edu.unikl.partOfClass;

public class Engine 
{
	public String engineNumber;
	public String engineType;
	
	public Engine()
	{
		
	}
	
	public void start()
	{
		System.out.println("engine-start");
	}
	
	public void stop()
	{
		System.out.println("engine-stop");
	}
	
	public String toString()
	{
		return "Engine number"+engineNumber+"engine type"+engineType;
	}
}
