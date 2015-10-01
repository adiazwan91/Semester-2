package my.unikl.edu.test;

import my.unikl.edu.week4.*;

public class FanTest
{
    public static void main(String[] args)
    {
        Fan fan1 = new Fan();

        fan1.setSpeed(Fan.FAST);
        fan1.setOn(true);
        fan1.setRadius(10.0);
        fan1.setColor("yellow");

        System.out.println(fan1);

        //System.out.println("Fan speed: "+fan1.getSpeed()+ "\nRadius: "+fan1.getRadius()+ "\nColor: "+fan1.getColor()+"\n");

        Fan fan2 = new Fan();
       
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setOn(false);
        fan2.setRadius(5.0);
        fan2.setColor("blue");

        System.out.println("\n");
        System.out.println(fan2);

        //System.out.println("Fan speed: "+fan2.getSpeed()+ "\nRadius: "+fan2.getRadius()+ "\nColor: "+fan2.getColor());
    }
}
