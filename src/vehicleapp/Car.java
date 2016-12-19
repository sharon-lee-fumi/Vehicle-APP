package vehicleapp;

/**
 * 
 * A car is represented by number of wheels, whether it can fly
 * and a method which returns its information
 * 
 * @author Xiaowen Li
 */
public class Car implements Vehicle
{
    private int numWheels;

    public Car(int numWheels)
    {
        this.numWheels = numWheels;
    }

    public int getNumWheels()
    {
        return numWheels;
    }

    public void setNumWheels(int numWheels)
    {
        this.numWheels = numWheels;
    }
    
    /**
     * @return false, because car cannot fly
     */
    @Override
    public boolean canFly()
    {
        return false; 
    }
    
    /**
     * @return a message to indicate the output of car object
     */
    @Override
    public String toString()
    {
        return "This is a car and it has " + this.getNumWheels() + " wheels."; 
    }
    
    
}
