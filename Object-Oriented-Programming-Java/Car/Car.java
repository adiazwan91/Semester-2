
package my.edu.unikl.realClass.Car;
import my.edu.unikl.PartOfClass.Door;
import my.edu.unikl.PartOfClass.Engine;

public class Car 
{
	public String carNumber;
	public Engine engine;
	public Door door;

	public Car()
	{

	}

	public Car(Engine engine, Door door)
	{
		this.engine = engine;
		this.door = door;
	}

	public Engine getEngine()
	{
		return engine;
	}

	public void setEngine(Engine engine)
	{
		this.engine = engine;
	}

	public String toString()
	{
		return engine.toString()+" "+ door.toStrin()+" belongs to car number "+carNumber;
	}
}
