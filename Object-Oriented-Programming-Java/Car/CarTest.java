package my.edu.unikl.test;

import my.edu.unikl.partOfClass.Door;
import my.edu.unikl.partOfClass.Engine;
import my.edu.unikl.realClass.Car;


public class CarTest 
{
	public static void main(String[] args)
	{
		Engine e = new Engine();
		Door d = new Door();
		Car c = new Car(e,d);
		
		System.out.println(c);
		
		c.door.doorType="normal";
		c.door.open();
		c.door.close();
		System.out.println("After adding the doorType as normal");		
		System.out.println(c);
		
		c.getEngine().engineNumber = "eng101";
		c.getEngine().engineType = "turbo";
		c.getEngine().start();
		c.getEngine().stop();
		System.out.println(c);
		
		c.carNumber = "AJL2757";
		System.out.println(c);
		System.out.println("=============================");
		
		e.engineNumber = "new engine";
		e.engineType = "new Engine type";
		c.setEngine(e);
		System.out.println("=============================");
		System.out.println("print engine object after updation");
		System.out.println(e);
		System.out.println("=============================");
		System.out.println("print car object after updation");
		System.out.println(c);
	}
}
