package my.unikl.edu.week4;

public class Fan
{
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

    public Fan()
    {

    }//End of default constructor

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public boolean getOn()
    {
        return on;
    }

    public void setOn(boolean on)
    {
        this.on = on;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String toString()
    {
        if(on==true)
        {
            return "\nSpeed: "+speed+ "\nRadius: "+radius+ "\nColor: "+color;

        }
        else
            return "Fan is off" +"\nRadius: "+radius+ "\nColor: "+color;
    }
}
